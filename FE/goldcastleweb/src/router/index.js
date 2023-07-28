import {createRouter, createWebHistory} from 'vue-router';
import MainPage from '@/views/MainPage.vue';
import ProductList from '@/views/ProductList.vue';

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
];

const router = createRouter({
    history : createWebHistory(),
    routes,
});

export default router;