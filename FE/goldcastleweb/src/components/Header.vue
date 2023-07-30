<template>
    <div>
        <div class = "section" id = "top">
            <div class = "container">
                <div>
                    <div class = "left">
                        <p>Welcome To GoldCastle Jewelry Shop</p>
                    </div>
                    <div class = "right">
                        <ul>
                            <li v-if = "isLoggedIn">
                                {{username}} 님 어서오세요!
                                <button @click ="userLogout" class = "logoutBtn">로그아웃</button>
                                <button @click = "addProduct" class = "logoutBtn">상품추가</button>
                                <button v-if ="userClass ===1" @click = "goToUserManagement" class = "logoutBtn">회원관리</button>
                                <button v-else @click = "goToMyPage" class = "mypageBtn">마이페이지</button>
                            </li>
                            <li v-else>
                                <span style = "cursor:pointer;" @click = "goToLoginPage">로그인 / 비회원으로 진행</span>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div><!--여기까지 top이요-->

        <!--헤더 시작-->
        <div class = "section" id = "header">
            <div class = "container">
                <div>
                    <div class = "mail"><img src = "../assets/message.png" alt = "msg"><p>goldcastle@gmail.com</p></div>
                    <div class = "logo"><img style = "cursor:pointer;" @click = "goToHomePage" src = "../assets/logo.png" alt = "lg"></div>
                    <div class = "shopping_cart">
                        <svg style = "cursor:pointer; width:40px; height:40px;" area-hidden = "true" focusable = "false" role = "presentation" class = "icon" viewBox = "0 0 700 700" @click = "CartList"></svg>
                        <div class = "cart-count-bubble" style = "cursor:pointer;" @click = "CartList">
                            <span area-hidden = "true">{{cartCount}}</span>
                        </div>
                        <p style = "cursor:pointer;" @click = "CartList">쇼핑카트</p>
                    </div>
                </div>
            </div>
        </div> <!---헤더끝임니당-->

        <!--메뉴시작-->
        <div class = "section" id = "menu">
            <div class = "container">
                <div>
                    <ul>
                        <li style = "cursor:pointer;" @click = "goToHomePage">Home</li>
                        <li style = "cursor:pointer;" @click = "goToProductPage">Product</li>
                        <li style = "cursor:pointer;" @click = "goToContactPage">Contact</li>
                    </ul>
                </div>
            </div>
        </div> <!--메뉴끝입니당-->
    </div>

</template>
<script>
export default {
    data(){
        return {
            isLoggedIn : false,
            username : '',
            userClass : 0,
            cartCount : 0,
        };
    },
    methods : {
        goToLoginPage(){

        },
        userLogout(){
            
        },
        addProduct(){
            
        },
        goToUserManagement(){

        },
        goToProductPage(){

        },
        goToMyPage(){

        },
        goToHomePage(){

        },
        goToContactPage(){
            
        },

    }
}

</script>
<style>
*{ padding:0; margin:0; text-decoration:none; list-style:none; box-sizing:border-box; font-family: Avenir, Helvetica, Arial, sans-serif; }
.section{ width:100%; position:relative; float:left; }
.section > .container{ width:1200px; position:relative; margin:0 auto; }
.container > div{ width:100%; float:left; }
  
/* top */
#top{ padding:11px 0; background:#151515; color:#999999; }
#top .left{ float: left; line-height: 30px; }
#top .right{ float:right; }
#top .right ul > li{ float:left; padding:0 15px; border-right:solid 1px #999999; }
#top .right ul > li:last-child{ border:none; }
#top .logoutBtn{ margin-left:10px; background:none; padding:5px 10px; color:#999; border:solid 1px #999; cursor:pointer; }

/* header */
#header{ padding:20px 0; border-bottom:1px solid #f5f5f5; }
#header .container > div{ display:flex; align-items:center; flex-wrap: wrap }
#header .container > div > div{  width:33.3334%;  }
#header .container > div > div > *{ display:inline-block; vertical-align:middle; }
#header .mail{ text-align:left; }
#header .logo{ text-align:center; }
#header .shopping_cart{ text-align:right; position:relative; }

/* footer */



/* menu */
#menu{ border-bottom:solid 1px #f5f5f5; }
#menu ul li { float:left; padding:15px 20px;  font-size:14px; color:#787878; }

/* visual */
#visual{ background:url('../assets/visual.png')center center /cover; height:700px; }

/* products */

#products{ padding:40px 0; text-align:center; }

#products .title{ color:#232323; font-size:28px; padding:10px 0; }
#products .category{ padding:20px 0; }
#products .category > ul{ display:flex; justify-content: center }
#products .category > ul > li{ padding:15px 20px;  color:#151515;  }
#products .category > ul > li.active{ background:#fae4df; font-weight:bold; }
#products .products > ul{ display:flex; flex-wrap: wrap;  }
#products .products > ul > li{ width:25%; padding-bottom:30px; }
.products > ul > li img{ width:270px; height:340px; object-fit:cover; }
#products .p_title{ margin: 10px 0; font-size:20px;  }
#products .p_price{ margin:5px 0; }
#products .p_desc{ font-size: 14px; letter-spacing: 1.5px; margin-top: 10px; }

#collection_controller > div > div{ display:flex; align-items:center; padding:15px 30px; background:#f5f5f5; }
#collection_controller > div > div > div{ width:50%; }

#collection_controller .layout > ul{ display:flex; }
#collection_controller .layout > ul > li.l_type_1{ width:24px; }
#collection_controller .layout > ul > li.l_type_2{ width:30px; height:30px; }
#collection_controller .layout > ul > li.l_type_3{ width:30px; }
#collection_controller .layout > ul > li.l_type_4{ width:30px; }
#collection_controller .layout > ul > li.l_type_4 .icon{ transform: rotate(90deg); }
#collection_controller .icon{ width: 30px; height: 30px; fill:#c7c7c7; cursor:pointer; }
#collection_controller .active .icon{ fill:#6f6f6f; }
#collection_controller .type_text{ margin-left:10px; line-height:30px; font-size:14px; letter-spacing: .8px; color: #323; }
#collection_controller .sorting label{ line-height:30px; font-size:14px; letter-spacing: .8px; color: #323; }

#collection_controller .sorting{ text-align: right; }
#collection_controller #SortBy{ min-width:302px; height:2.5rem; background:#ffffff80; color:#acaaa6; border:1px solid rgba(0,0,0,.1); padding: 0 15px; }



/* product page */
#productPage{ padding:50px 0; }
#productPage .pr_page_wrap{ display:flex; flex-wrap: wrap; }
#productPage .pr_page_wrap > .edit_btns{ width:100%; padding:15px 100px; }
#productPage .edit_btns > button{ padding:10px 20px; background:none; border-radius:5px; background:#fae4df; border:none; font-weight:bold; cursor:pointer; }
#productPage .pr_page_wrap > li{ width:50%; }
#productPage .leftImg{ text-align: center; }
#productPage .leftImg img{ width:400px; height:530px; object-fit: cover; border:solid 1px #f5f5f5;  }

#productPage .rightText{ color:#232323; }
#productPage .rightText > *{ width:100%; float: left; padding:20px 0; }
#productPage .rightText .title{ margin-bottom: 20px; font-weight:400; font-size:26px; line-height: 1.1; letter-spacing: .5px; }
#productPage .rightText .price{ font-weight:500; font-size:20px; }
#productPage .rightText .ea{ font-weight:500; font-size:20px; }
#productPage .realBtn li{ padding:10px 0; }
#productPage .rightText .prevBtn button{ padding: 15px 20px; width:45%; background:#fae4df; color:#151515; border:none; letter-spacing: .5px; }
#productPage .realBtn > ul > li{ display:none; }
#productPage .rightText .realBtn button{ padding: 15px 20px; width:45%; background:#fae4df; color:#151515; border:none; letter-spacing: .5px; }

/* order area */
#order{ text-align: left; margin-bottom: 40px; }
#order > div > div{ border:solid 2px #f5f5f5; border-radius:5px; padding-bottom:30px;}
#order .title_bar{ background:#999999; padding:10px 15px; color: #f5f5f5; font-size:20px; letter-spacing: .9px; border-top-left-radius: 5px; border-top-right-radius: 5px; }
#order .title_input{ padding:20px 30px; }
#order .title_text{ font-size:23px; font-weight:600; }
#order .title_input ul{ display:flex; flex-wrap:wrap; }
#order .title_input .w50{ width:50%; margin:10px 0; }
#order .title_input .w100{ width:100%; margin:10px 0; }

#order .title_input .w100 input[type="text"], #order .title_input .w100 input[type="number"]{ width:95%; }

#order .title_input label{ width:100%; float:left; }
#order .title_input label[for="home"], #order .title_input label[for="business"], #order .title_input label[for="zip"]{ width:auto; float:none; }
#order .title_input input[type="text"], #order .title_input input[type="number"]{ width:90%; height:35px; border:none; border:solid 1.5px #e5e5e5; border-radius:5px; padding-left:10px; }


#order .title_res{ padding:0 30px; }
#order .title_res ul{ background: #f1f1f1; border:solid 1.5px #e5e5e5; padding:20px 250px;  }

.rating-active:before {
    content: "\2605";
    position: absolute;
 }
 .rating {
   display: inline;
   /* margin-left: 10px;
   margin-top: 10px; */
   float:right;
 }
 .rating > span {
   display: inline-block;
   position: relative;
   width: 1.1em;
 }
 
 /* login & join */
 #user_c{ padding:40px 0; }
 #user_c > div > div{ display:flex; justify-content: space-evenly; background: #f1f1f1; border-radius: 10px; padding:30px 0; }

 #user_c .side_bar{ padding:0 20px; height:719px; }
 #user_c .side_bar > div{ height:100%; border:dashed 1px #c5c5c5; }
 
 #user_c .join{ text-align:left; width:45%; }
 #user_c .join li{ padding:20px 0; }
 #user_c .join label{ color:#adadad; font-size:13px; }
 #user_c .join input{ padding-left:20px; width:100%; border:none; background:none; height:45px; border-bottom: solid 1px #adadad; font-size:15px; }
 #user_c .join button{ background:none; text-align:center; width:100%; height:60px; border:solid 1px #a7a7a7; font-size:17px; cursor:pointer; }
 
 #user_c .login{ width:45%; padding:0 20px; text-align:left; } 
 #user_c .login li{ padding:20px 0; }
 #user_c .login label{ color:#adadad; font-size:13px; }
 #user_c .login input{ padding-left:20px; width:100%; border:none; background:none; height:45px; border-bottom: solid 1px #adadad; font-size:15px; }
 #user_c .login button{ background:none; text-align:center; width:100%; height:60px; border:solid 1px #a7a7a7; font-size:17px; cursor:pointer; }
 .cart-count-bubble{ background:#232323; border-radius:50%; width:15px; height:15px; position:absolute; left: 275px; top: 4px; color: white; font-size: 12px; text-align: center; }
 
 #cart{ text-align:center; padding-top:30px; letter-spacing:0.15rem; }
 #cart .cart_title{ font-size:34px; }
 .cart_header{ background:#f5f5f5; margin-top:30px; }
 .cart_header > ul{ display:flex; text-align:center; font-size:17px; color:#232323; }
 .cart_header > ul > li{ padding:15px 30px; }
 .cart_header > ul > li:nth-child(1){ width:15%; text-align:left; }
 .cart_header > ul > li:nth-child(2){ width:25%; }
 .cart_header > ul > li:nth-child(3){ width:15%; }
 .cart_header > ul > li:nth-child(4){ width:22.5%; }
 .cart_header > ul > li:nth-child(5){ width:22.5%; }
 
 .cart_list{ display:flex; flex-wrap:wrap; }
 .cart_list > ul{ width:100%; display:flex; align-items: center; justify-content: center; padding:20px 0; border-top: 0.1rem solid rgba(0,0,0,.06); }
 
 .cart_list > ul > li:nth-child(1){ width:15%; }
 .cart_list > ul > li:nth-child(2){ width:25%; }
 .cart_list > ul > li:nth-child(3){ width:15%; }
 .cart_list > ul > li:nth-child(4){ width:22.5%; }
 .cart_list > ul > li:nth-child(5){ width:22.5%; }
 
 .cart_list > ul > li:nth-child(1) img{ width:75%; }
 .cart_list > ul > li:nth-child(2){ padding:40px 20px; }
 
 .cart_res { display:flex; justify-content:center; align-items:flex-end; background:#f5f5f5; padding:20px 25px; justify-content: flex-end; }
 .cart_res .res_subtotal{ margin-right:10%; }



</style>