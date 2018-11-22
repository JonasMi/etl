<template>
    <div class="footer">
        <strong>Copyright</strong> Example Company © 2015-2018
        <div class="pull-right">
            <img src="../assets/nestvision.png" alt="">
        </div>
    </div>
</template>

<script>
    export default {}
</script>

<style scoped lang="less">
    .footer {
        position: fixed;
        bottom: 0;
        left: 0;
        right: 0;
        z-index: 98;
        padding: 10px 20px;
        background: white;
        border-top: 1px solid #e7eaec;
        transition: all .4s cubic-bezier(.25, .8, .25, 1);
    }
</style>
