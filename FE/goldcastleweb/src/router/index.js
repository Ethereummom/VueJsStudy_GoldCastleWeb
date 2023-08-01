import {createRouter, createWebHistory} from 'vue-router';
import MainPage from '@/views/MainPage.vue';
import ProductList from '@/views/ProductList.vue';
import ProductDetail from '@/views/ProductDetail.vue';
import ContactPage from '@/views/ContactPage.vue';

const routes = [
    {
        path : '/',
        name : 'MainPage',
        component : MainPage,
    },
    {
        path : '/products',
        name : 'ProductList',
        component : ProductList,


    },
    {
        path : '/contact',
        name : 'ContactPage',
        component : ContactPage,
    },
    {
        path : '/products/:pid',
        name : 'productdetail',
        component : ProductDetail,
    },
];

const router = createRouter({
    history : createWebHistory(),
    routes,
});

export default router;