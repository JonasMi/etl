<template>
    <div>
        <el-dialog
                :title="dialog.title"
                :visible.sync="dialog.show"
                :close-on-click-modal="false"
                :width="dialog.width">
            <template v-if="dialog.pageShow==='addTenant'">
                <el-form :model="tenantForm" :rules="rulesTenantForm" ref="tenantForm" label-width="150px" class="demo-ruleForm">
                    <div class="group_wrap">
                        <p>
                            NEST
                        </p>
                        <div>
                            <el-form-item label="NEST租户ID" prop="nestIdentifier">
                                <el-input type="text" v-model="tenantForm.nestIdentifier" placeholder="请输入NEST租户ID,不能为空"></el-input>
                            </el-form-item>
                            <el-form-item label=" NEST租户名称" prop="nestName">
                                <el-input type="text" v-model="tenantForm.nestName" placeholder="请输入 NEST租户名称，不能为空"></el-input>
                            </el-form-item>
                            <el-form-item label=" NEST租户描述" prop="nestDescription">
                                <el-input type="text" v-model="tenantForm.nestDescription" placeholder="请输入NEST租户描述，不能为空"></el-input>
                            </el-form-item>
                        </div>
                    </div>
                    <div class="group_wrap">
                        <p>CDR</p>
                        <div>
                            <el-form-item label=" CDR租户ID" prop="cdrName">
                                <el-input type="text" v-model="tenantForm.cdrName" placeholder="请输入CDR租户ID，不能为空"></el-input>
                            </el-form-item>
                            <el-form-item label=" CDR对称密钥" prop="name">
                                <el-input type="text" v-model="tenantForm.symmetricKey" placeholder="请输入CDR对称密钥，不能为空"></el-input>
                            </el-form-item>
                            <el-form-item label=" CDR公钥" prop="cdrPublicKey" style="width: 100%;">
                                <el-input type="textarea" rows="3" style="width:98%;" v-model="tenantForm.cdrPublicKey" placeholder="请输入公钥，不能为空"></el-input>
                            </el-form-item>
                        </div>
                    </div>
                    <div class="group_wrap">
                        <p>私钥</p>
                        <div>
                            <el-form-item label="私钥密码" prop="privateKeyPassword">
                                <el-input type="text" v-model="tenantForm.privateKeyPassword" placeholder="请输入私钥密码，不能为空"></el-input>
                            </el-form-item>
                            <el-form-item label="证书密码" prop="keyStorePassword">
                                <el-input type="text" v-model="tenantForm.keyStorePassword" placeholder="请输入证书密码，不能为空"></el-input>
                            </el-form-item>
                            <el-form-item label="别名" prop="alias">
                                <el-input type="text" v-model="tenantForm.alias" placeholder="请输入别名，不能为空"></el-input>
                            </el-form-item>
                            <el-form-item label=" 证书" prop="keyStoreContent" style="width:100%;">
                                <el-input class="flo_left" type="textarea" style="width:70%;" v-model="tenantForm.keyStoreContent" placeholder="请上传证书，不能为空"
                                          rows="3" disabled></el-input>
                                <input type="file" style="width:25%;margin-top:50px;margin-left: 10px;" class="input_file" name="keyStoreFile" id="keyStoreFile"
                                       @change="onChangeKeyStoreFile($event,'keyStore')">
                            </el-form-item>
                        </div>
                    </div>

                </el-form>
                <div slot="footer" class="dialog-footer">
                    <el-button @click="dialog.show = false" size="mini">取 消</el-button>
                    <el-button type="primary" size="mini" @click="confimSubmitTenant">确 定</el-button>
                </div>
            </template>
        </el-dialog>
        <div class="marg_bot10 overflow border_bottom_grey padd_bottom5">
            <div class="flo_left">
                <el-button type="primary" size="mini" @click="clickAddTenant">新增</el-button>
            </div>
            <div class="overflow flo_right">
                <el-input class="flo_left marg_right10" style="width:200px;" placeholder="请输入CDR名称" v-model="search.cdrName"></el-input>
                <el-input class="flo_left marg_right10" style="width:200px;" placeholder="请输入NEST名称" v-model="search.nestName"></el-input>
                <el-button title="查询" style="margin-top: 2px;" size="mini" type="success" @click="getTenantsAndTotal"><i class="el-icon-search"></i></el-button>
            </div>

        </div>
        <div>
            <div>
                <el-table
                        v-loading="loading"
                        element-loading-text="拼命加载中"
                        element-loading-spinner="el-icon-loading"
                        element-loading-background="rgba(0, 0, 0, 0.8)"
                        :data="tenantList"
                        border
                        stripe
                        style="width: 100%">
                    <el-table-column label="Nest">
                        <el-table-column
                                label="租户名称">
                            <template slot-scope="scope">
                                <a class="cur_poiner" style="color:#409eff;text-decoration: underline" @click="clickTenantPage(scope.row)">
                                    {{scope.row.nestName}}
                                </a>
                            </template>
                        </el-table-column>
                        <el-table-column
                                prop="nestDescription"
                                label="描述">
                        </el-table-column>
                    </el-table-column>
                    <el-table-column label="CDR">
                        <el-table-column
                                prop="cdrName"
                                label="租户名称">
                        </el-table-column>
                        <el-table-column
                                label="公钥">
                            <template slot-scope="scope">
                                <div style="text-overflow: ellipsis;overflow: hidden; white-space: nowrap;">
                                    {{scope.row.cdrPublicKey}}
                                </div>
                            </template>
                        </el-table-column>
                    </el-table-column>
                    <el-table-column label="私钥">
                        <el-table-column
                                label="证书">
                            <template slot-scope="scope">
                                <div style="text-overflow: ellipsis;overflow: hidden; white-space: nowrap;">
                                    {{scope.row.keyStoreContent}}
                                </div>
                            </template>
                        </el-table-column>
                        <el-table-column
                                prop="keyStorePassword"
                                label="证书密码">
                        </el-table-column>
                        <el-table-column
                                prop="privateKeyPassword"
                                label="私钥密码">
                        </el-table-column>
                    </el-table-column>
                    <el-table-column
                            width="100"
                            label="状态">
                        <template slot-scope="scope">
                            <span v-if="scope.row.archived" class="color_danger">已归档</span>
                            <span v-else-if="!scope.row.archived" class="color_success">正常</span>
                        </template>
                    </el-table-column>
                    <el-table-column
                            width="150"
                            label="操作">
                        <template slot-scope="scope">
                            <div v-if='!scope.row.archived'>
                                <el-button size="mini" type="warning" @click="clickEditTenant(scope.row,scope.$index)">编辑</el-button>
                                <el-button type="danger" size="mini" @click="clickArchiveTenant(scope.row,scope.$index)">归档</el-button>
                            </div>
                        </template>
                    </el-table-column>
                </el-table>
            </div>
            <div class="marg_top10 overflow">
                <div class="flo_right">
                    <el-pagination
                            @current-change="getTenantsAndTotal"
                            :current-page.sync="search.page"
                            :page-size="search.size"
                            layout="prev, pager, next, jumper"
                            :total="tenantsTotal">
                    </el-pagination>
                </div>

            </div>
        </div>


    </div>
</template>

<script src="./tenant-management.js"></script>
<style lang="less" scoped>
    .form_wrap {
        border-left: 1px solid #d1d1d1;
        border-right: 1px solid #d1d1d1;
    }

    .tenantForm_wrap {
        display: flex;
        border-bottom: 1px solid #d1d1d1;
        .form_label, .form_content {
            float: left;
        }
        .form_label {
            width: 40%;
            text-align: right;
            line-height: 30px;
            background: #eee;
        }
        .form_content {
            width: 100%;
            textarea {
                float: left;
                margin: 3px;
                border-radius: 5px;
            }
            .input_file {
                width: 25%;
                margin-top: 20px;
            }
            input {
                width: 99%;
                height: 30px;
                border: none;
                /*outline: none;*/
                padding-left: 5px;
            }
        }
    }

    .tenantForm_wrap:first-child {
        border-top: 1px solid #d1d1d1;
    }

    .group_wrap {
        p {
            border-bottom: 1px dashed #d1d1d1;
        }
        > div {
            overflow: hidden;
            .el-form-item {
                float: left;
                width: 50%;
            }
        }
    }


</style>
