<template>
    <div>
        <!--visual-->
        <div class = "section" id = "visual">
            <div class = "container">
                <div>
                    <!--임시여백-->
                </div>
            </div>
        </div>
        <!--visual end-->

        <!--icons시작-->
        <div class = "section" id = "icons">
            <div class = "container">
                <div>
                    <!--임시여백-->
                </div>
            </div>
        </div>
        <!--icons끝-->

        <!--products시작-->
        <div class = section id = "products">
            <div class = "container">
                <div>
                    <div class = "title">
                        <ul>
                            <li><p>TRENDING PRODUCTS</p></li>
                        </ul>
                    </div>
                    <div class = "category">
                        <ul>
                            <li :class = "{ active: activeTab === 'featured'}" @click="activeTab = 'featured'">FEATURED</li>
                            <li :class = "{ active: activeTab === 'best_sellers'}" @click="activeTab = 'best_sellers'">BEST SELLERS</li>
                            <li :class = "{ active: activeTab === 'new_arrivals'}" @click="activeTab = 'new_arrivals'">NEW ARRIVALS</li>
                        </ul>
                    </div>
                    <div class = "products">
                        <ul>
                            <!--임시여백---->
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <!--products끝-->
    </div>
</template>

<script>
export default{
    data(){
        return {
            activeTab : 'featured',
        };
    },
};
</script>

<style>

</style>