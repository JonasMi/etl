<template>
    <div :class="{'small-menu':smallMenu}">
        <Navigation></Navigation>
        <div class="content">
            <CommonHeader></CommonHeader>
            <div class="main-content">
                <router-view></router-view>
            </div>
        </div>
        <CommonFooter></CommonFooter>
    </div>
</template>

<script>
    import Navigation from './navigation.vue'
    import CommonFooter from './common-footer.vue'
    import CommonHeader from './common-header.vue'
    import { mapState } from 'vuex'

    export default {
        computed:{
            ...mapState('common',{
                smallMenu: state => state.smallMenu,
            })
        },
        name: 'hello',
        data () {
            return {}
        },
        components: {
            Navigation,
            CommonFooter,
            CommonHeader
        }
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
