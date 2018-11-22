import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui'
import { Message } from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import 'font-awesome/css/font-awesome.min.css'
import axios from 'axios'
import store from './store/modules'

window.axios = axios

axios.interceptors.response.use(function (response) {
    // Do something with response data
    return response
}, function (error) {
    // Do something with response error
    // console.log(error.response.data)
    if(error.response&&error.response.data){
        Vue.prototype.$message.error(error.response.data.message)
        return Promise.reject(error)
    }

})
var ElTreeGrid = require('element-tree-grid')
Vue.component(ElTreeGrid.name, ElTreeGrid)

import 'lodash'
window.lodash = _
Vue.use(ElementUI)
// import validator from '../validator/validation'
import Validator from 'vue-validator'
Vue.use(Validator)
Vue.config.productionTip = false
import './less/style.less'
import { mapState, mapActions } from 'vuex'
// console.log(this.role)
new Vue({
    el: '#app',
    router,
    store,
    components: {App},
    template: '<App/>',
    computed:{
        ...mapState('common',{
            loginUser:state=>state.loginUser
        })
    },
    methods: {

    },
    mounted(){


    }
})
