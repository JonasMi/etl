import { mapState, mapActions } from 'vuex'
import messageListComponent from '@/components/message-list-component.vue'



export default {
    components:{
        messageListComponent
    },
    computed: {
        // ...mapState('tenantManagement', {
        //     tenantList: state => state.tenantList
        // }),
    },
    data () {
        return {
            search:{value:''},
            messageList:[],
        }
    },
    methods: {
        // ...mapActions('', []),


    },
    mounted () {
    },
    watch:{

    }

}

