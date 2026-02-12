// src/router/index.js
import HomeView from '@/views/HomeView/HomeView.vue'
import { createRouter, createWebHistory } from 'vue-router'



const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  
]

const router = createRouter({
  history: createWebHistory(),          // modo HTML5 (sem # na URL) - recomendado
  // history: createWebHashHistory(),   // modo hash (#/about) - útil em servidores simples
  routes
})

export default router