import URLParser from '@/utils/url-parser.js'
import axios from 'axios'

const patient = {
    get ({commit, state}) {
        commit('CHANGE_LOADING', true)
        let url = URLParser.parseUrl('/tenants/', state.pagination)
        url += '&archived=' + state.archived
        axios.get(url).then((datas) => {
            datas.data.content.forEach((data, index) => {
                data.item = index
                data.idItem = data.identifier + index
            })
            commit('CHANGE_LOADING', false)
            commit('GET', datas.data)
        }).catch(() => {
            commit('CHANGE_LOADING', false)
        })
    },
    save ({commit}, tenant) {
        let url = URLParser.submitUrl('/tenants/')
        let method = 'post'
        if (tenant.data.identifier) {
            url += tenant.data.identifier + '/'
            method = 'put'
        }
        return new Promise((resolve, reject) => {
            axios({
                method: method,
                url: url,
                data: tenant.data
            }).then((newTenant) => {
                if (newTenant.data && newTenant.data.identifier) {
                    tenant.data.identifier = newTenant.data.identifier
                    commit('ADD', tenant)
                } else {
                    commit('REFRESH', tenant)
                }

                resolve()
            }).catch((error) => {
                if (error.response) {
                    reject(error.response.data.message)
                } else {
                    reject()
                }
            })
        })
    },
    archive ({commit}, tenant) {
        let url = URLParser.submitUrl('/tenants/' + tenant.id + '/archive/')
        return new Promise((resolve, reject) => {
            axios({
                method: 'post',
                url: url
            }).then(() => {
                commit('ARCHIVE', tenant.id)
                resolve()
            }).catch((error) => {
                if (error.response) {
                    reject(error.response.data.message)
                } else {
                    reject()
                }
            })
        })
    }
}

export default patient

