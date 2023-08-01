<template>
    <div>
        <!-- collection-->
        <div class = "section" id = "collection_controller">
            <div class = "container">
                <div>
                    <div class = "layout">
                        <ul>
                            <li class = "l_type_1" :class = "{active : activeTab ===1}" @click="changeTab(1)">
                                <svg area-hidden = "true" focusable = "false" role = "presentation" class = "icon" viewBox = "0 0 80 80">
                                    <g transform="translate(0.000000,48.000000) scale(0.100000,-0.100000)" stroke="none">
                                        <path d="M10 240 l0 -230 50 0 50 0 0 230 0 230 -50 0 -50 0 0 -230z"></path>
                                        <path d="M180 240 l0 -230 50 0 50 0 0 230 0 230 -50 0 -50 0 0 -230z"></path>
								    </g>
                                </svg>
                            </li>
                            <li class = "l_type_2" :class = "{active : activeTab ===2}" @click="changeTab(2)">
                                <svg area-hidden = "true" focusable = "false" role = "presentation" class = "icon" viewBox = "0 0 80 80">
                                    <g transform="translate(0.000000,48.000000) scale(0.100000,-0.100000)" stroke="none">.
                                        <path d="M10 240 l0 -230 50 0 50 0 0 230 0 230 -50 0 -50 0 0 -230z"></path>
                                        <path d="M180 240 l0 -230 50 0 50 0 0 230 0 230 -50 0 -50 0 0 -230z"></path>
                                        <path d="M350 240 l0 -230 50 0 50 0 0 230 0 230 -50 0 -50 0 0 -230z"></path>
                                    </g>
                                </svg>

                                
                            </li>
                            <li class = "l_type_3" :class = "{active : activeTab ===3}" @click="changeTab(3)">
                                <svg area-hidden = "true" focusable = "false" role = "presentation" class = "icon" viewBox = "0 0 80 80">
                                    <g transform="translate(0.000000,48.000000) scale(0.100000,-0.100000)" stroke="none">
                                        <path d="M10 240 l0 -230 50 0 50 0 0 230 0 230 -50 0 -50 0 0 -230z"></path>
                                        <path d="M180 240 l0 -230 50 0 50 0 0 230 0 230 -50 0 -50 0 0 -230z"></path>
                                        <path d="M350 240 l0 -230 50 0 50 0 0 230 0 230 -50 0 -50 0 0 -230z"></path>
                                        <path d="M520 240 l0 -230 50 0 50 0 0 230 0 230 -50 0 -50 0 0 -230z"></path>
                                    </g>
                                </svg>
                            </li>
                            <li class = "type_text">
                                <p>Showing 20 to 20 products</p>
                            </li>
                        </ul>
                    </div>
                    <div class = "sorting">
                        <label for = "sort">종류별로 보기</label>
                        <select name = "" id = "SortBy" v-model = "selectedCategory">
                            <option value = "">전체</option>
                            <option value = "ring">반지</option>
                            <option value = "necklace">목걸이</option>
                            <option value = "bracelet">팔찌</option>
                            <option value = "anklet">발찌</option>
                        </select>
                    </div>
                </div>
            </div>
        </div>

        <div class = "section" id = "products">
            <div class = "container">
                <div>
                    <div class = "products">
                        <ul>
                            <!-- v-for 디렉티브 사용해서 반복렌더링-->
                            <li v-for = "prod in sortedProducts" :key = "prod.pid" >
                                <img :src= "prod.pphoto" alt = "plh">
                                <p>{{prod.pname}}</p>
                                <p>{{prod.pcontent}}</p>
                                <p>{{prod.pprice}}</p>
                                <a @click="goToProduct(prod.pid)">상세보기</a>
                            </li>
                        </ul>
                    </div>
                    <a @click = "goToPage(0)">[FIRST]</a>
                    <a v-if = "currentPageNo > 0" @click="goToPage(currentPageNo - 1)">[PRE]</a>
                    <a v-else>[PRE]</a>

                    <a v-for ="page in totalPages" :key = "page" @click="goToPage(page)">[{{page}}]</a>
                    <a v-if = "currentPageNo < totalPages -1 " @click="goToPage(currentPageNo + 1)">[NEXT]</a>
                    <a v-else>[NEXT]</a>
                    <a @click = "goToPage(totalPages-1)">[END]</a>
                    <br> <a href = "/">홈으로 돌아가기</a>
                </div>
            </div>
        </div>
        <!--상품끝-->

    </div>
</template>

<script>
import axios from 'axios';

export default{
    data(){
        return {
            activeTab : 1,
            prodList : [],
            prod : {},
            page : 1,
            limit : 10,
            imgDir : "s3...",
            ppiVO : {},
            currentPageNo : 0,
            totalPages : 0,
            selectedCategory : "",
        };
    },
    methods : {
        //탭변경
        changeTab(tabIndex){
            this.activeTab = tabIndex;
            //TODO : 해당 탭에 맞는 상품 목록을 서버에서 가져오는 로직 필요
        },
        goToPage(pageNumber){
            this.currentPageNo = pageNumber;
            axios.get(`http://localhost:8070/api/v1/products?page=${pageNumber}`)
                .then(response => {
                    this.prodList = response.data;
                    console.log(response.data)

                })
                .catch(error => {
                    console.error('데이터 불러오기 실패',error)
                });
            //TODO : 해당 페이지 번호에 맞는 상품 목록을 서버에서 가져오는 로직(SPRING BACKEND SERVER)
        },
        //상품상세페이지로이동하기
        goToProduct(pid){
                this.$router.push({name : 'productdetail', params : {pid:pid }});
        },
        fetchProductDataFromServer(){
            //axios를 사용하여 Spring server의 api endpoint에 get요청하기
            axios.get('http://localhost:8070/api/v1/product/products')
            .then(response => {
                this.prodList = response.data.content;
                this.totalPages = response.data.totalPages;
                this.prod = this.prodList[0];
                console.log(this.prodList);
                
            }).catch(error => {
                    console.error('데이터 가져오기 실패' , error);
                });

        },
        // handleSortByChange(event){
        //     const selectedValue = event.target.value;
        //     this.fetchProductsByCategory(selectedValue);

        // }
    },
    computed : {
        sortedProducts(){
            console.log(this.selectedCategory)
            if(this.selectedCategory === ""){
                return this.prodList;
            }else{
                return this.prodList.filter((prod) => prod.pcategory === this.selectedCategory);
            }
        }

    },
    mounted(){
        //페이지가 로드 시 실행되는 코드
        // TODO : 초기 데이터 가져오는 로직 필요
        // 예를 들어서, 상품 목록과 페이지 정보를 서버에서 받아와서 데이터 채워넣기.
        this.fetchProductDataFromServer();
    },
};
</script>
<style>

</style>