import { createApp } from 'vue'
import { createPinia } from 'pinia'
import App from './App.vue'

import TDesign from 'tdesign-vue-next'

// 引入组件库全局样式资源
import 'tdesign-vue-next/es/style/index.css';

import './assets/main.css'

const app = createApp(App)

app.use(createPinia()).use(TDesign)

app.mount('#app')
