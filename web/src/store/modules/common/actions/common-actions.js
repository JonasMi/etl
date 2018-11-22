import Constants from '@/utils/constants.js'
import axios from 'axios'

const actions = {
    /**
     *菜单按钮的切换
     */
    toggleMenu({commit}){
        commit('TOGGLE_MENU')
    },

}

export default actions

