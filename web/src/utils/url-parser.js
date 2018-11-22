import { serverBaseUrl } from '@/constants'

export default {
    submitUrl (bizUrl) {
        if(bizUrl.indexOf('http://') === -1) {
            return serverBaseUrl + bizUrl
        } else {
            return bizUrl
        }
    },
    parseUrl (bizUrl, pagination) {
        let baseUrl
        if(bizUrl.indexOf('http://') === -1) {
            baseUrl = serverBaseUrl + bizUrl
        } else {
            baseUrl = bizUrl
        }
        let currentPage = pagination && pagination.page || 0
        let pageSize = pagination && pagination.size || 10000
        let url = baseUrl
        if (baseUrl.indexOf('?') !== -1) {
            url += '&'
        } else {
            url += '?'
        }

        let page = currentPage - 1
        page = page < 0 ? 0 : page

        url = url + 'page=' + page + '&size=' + pageSize
        if (pagination && pagination.sort && pagination.sort.sort && pagination.sort.dir) {
            url = url + '&sort=' + pagination.sort.sort + ',' + pagination.sort.dir
        }
        return url
    }


}
