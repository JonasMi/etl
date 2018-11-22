<#ftl output_format="XML">
<!-- 住院结算示例 -->
<Claim xmlns="http://hl7.org/fhir">
    <#if insuranceNumber??>
    <!-- 农合/医保流水号 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/insurance-number">
        <valueIdentifier>
            <#if medicalinsRuralcmsMark??>
            <#if medicalinsRuralcmsMark==2>
            <system value="http://www.nestvision.com/platform/app/data/v1/identifier/medicalins" />
            </#if>
            <#if medicalinsRuralcmsMark==1>
            <system value="http://www.nestvision.com/platform/app/data/v1/identifier/ruralcms" />    
            </#if>
            </#if>
            <!-- 农合/医保流水号 -->
            <value value="${insuranceNumber}" />
        </valueIdentifier>
    </extension>
    </#if>
    <#if inpatientRegistrationId??>
    <!-- 住院流水号 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/reg-pavisit-id">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-registration-id|${inpatientRegistrationId}" />
        </valueReference>
    </extension>
    </#if>
    <#if reimbursementType??>
    <!-- 报销类型 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/reimbursement-type">
        <valueCode value="${reimbursementType}" />
    </extension>
    </#if>
    <#if invoiceId??>
    <!-- 打印发票号 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/invoice-id">
        <valueString value="${invoiceId}" />
    </extension>
    </#if>
    <#if cancelType??>
    <!-- 是否红票标识:否 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/cancel-type">
        <valueBoolean value="${cancelType?string("true","false")}" />
    </extension>
    </#if>
    <#if feeCode??>
    <!-- 医疗付费方式代码 -->
    <extension url="urn:oid:2.16.156.10011.2.3.1.269">
        <valueCode value="${feeCode}" />
    </extension>
    </#if>
    <#if clinCostDate??>
    <!-- 收费时间 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/clin-cost-date">
        <valueDateTime value="${clinCostDate?string("yyyy-MM-dd")}T${clinCostDate?string("HH:mm:ss")}" />
    </extension>
    </#if>
    <#if notes??>
    <!-- 备注 -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/text/notes">
        <valueString value="${notes}" />
    </extension>
    </#if>
    <#if psnExpense??>
    <!-- 个人承担费用 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/psn-expense">
        <valueDecimal value="${psnExpense}" />
    </extension>
    </#if>
    <#if reimbursementCost??>
    <!-- 报销金额 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/reimbursement-cost">
        <valueDecimal value="${reimbursementCost}" />
    </extension>
    </#if>
    <#if submitRatio??>
    <!-- 报销比例 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/submit-ratio">
        <valueDecimal value="${submitRatio}" />
    </extension>
    </#if>
    <!-- 住院费用支付信息集 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/extension/cli-register-paymays">
        <#if inpatientChargesPayDetails ??>
        <#list inpatientChargesPayDetails as inpatientChargesPayDetail>
        <!-- 住院费用支付信息1 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/extension/cli-register-paymay">
            <#if inpatientChargesPayDetail.settlementCode??>
            <!-- 结算方式代码CV0710004 -->
            <extension url="urn:oid:2.16.156.10011.2.3.1.198">
                <valueCode value="${inpatientChargesPayDetail.settlementCode}" />
            </extension>
            </#if>
            <#if inpatientChargesPayDetail.payAmount??>
            <!-- 支付金额 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/number/pay-amount">
                <valueDecimal value="${inpatientChargesPayDetail.payAmount}" />
            </extension>
            </#if>
            <#if inpatientChargesPayDetail.paymentNotes??>
            <!-- 支付备注 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/text/payment-notes">
                <valueString value="${inpatientChargesPayDetail.paymentNotes}" />
            </extension>
            </#if>
        </extension>
        </#list>
        </#if>
    </extension>
<!-- 页数（针对于明细项多的情况分批上传的批次号，从1开始）-->
    <#if pageNum ??>
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/page-num">
        <valueInteger value="${pageNum}" />
    </extension>
    </#if>
    <!-- 指明是住院结算 -->
    <type value="institutional" />
    <#if inpatientChargesId??>
    <!-- 原系统住院收费单id号 -->
    <identifier>
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-charges-id" />
        <value value="${inpatientChargesId}" />
    </identifier>
    </#if>
    <#if created??>
    <!-- 报销日期 -->
    <created value="${created?string("yyyy-MM-dd")}" />
    </#if>
    <#if created??>
    <!-- 原收费单号id，仅当此单为红票时有用 -->
    <related>
        <claimReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/inpatient-charges-id|${originalChargesId}" />
        </claimReference>
    </related>
    </#if>
    <payee>
        <!-- 收费人类型 -->
        <type>
            <code value="provider" />
        </type>
        <#if chargeEmpId??>
        <!-- 收费人ID -->
        <partyReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${chargeEmpId}" />
        </partyReference>
        </#if>
    </payee>
    <#if patientId??>
    <!-- 患者ID -->
    <patientReference>
        <!-- 此处使用身份证号，用身份证命名空间 -->
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id|${patientId}" />
    </patientReference>
    </#if>
    <#if inpatientChargesDetails ??>
    <#list inpatientChargesDetails as inpatientChargesDetail>
    <item>
        <#if inpatientChargesDetail.recipeId??>
        <!-- 处方号 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/identifier/recipe-id">
            <valueString value="${inpatientChargesDetail.recipeId}" />
        </extension>
        </#if>
        <#if inpatientChargesDetail.submitRatio??>
        <!-- 报销比例 % -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/number/submit-ratio">
            <valueDecimal value="90" />
        </extension>
        </#if>
        <#if inpatientChargesDetail.amountReimbursement??>
        <!-- 报销金额 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/number/amount-reimbursement">
            <valueDecimal value="${inpatientChargesDetail.amountReimbursement}" />
        </extension>
        </#if>
        <#if inpatientChargesDetail.selfAmount??>
        <!-- 自费金额 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/number/self-amount">
            <valueDecimal value="${inpatientChargesDetail.selfAmount}" />
        </extension>
        </#if>
        <#if inpatientChargesDetail.itemSpec??>
        <!-- 项目规格 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/text/item-spec">
            <valueString value="${inpatientChargesDetail.itemSpec}" />
        </extension>
        </#if>
        <#if inpatientChargesDetail.clinCostDate??>
        <!-- 收费时间 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/datetime/clin-cost-date">
            <valueDateTime value="${inpatientChargesDetail.clinCostDate?string("yyyy-MM-dd")}T${inpatientChargesDetail.clinCostDate?string("HH:mm:ss")}" />
        </extension>
        </#if>
        <#if inpatientChargesDetail.isBaby??>
        <!-- 是否婴儿标志 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/boolean/is-baby">
            <valueBoolean value="${inpatientChargesDetail.isBaby?string("true","false")}" />
        </extension>
        </#if>
        <#if inpatientChargesDetail.orderedDpid??>
        <!-- 开单科室 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/identifier/ordered-dpid">
            <valueReference>
                <reference
                    value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${inpatientChargesDetail.orderedDpid}" />
            </valueReference>
        </extension>
        </#if>
        <#if inpatientChargesDetail.orderedEmpid??>
        <!-- 开单医生 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/identifier/ordered-empid">
            <valueReference>
                <reference
                    value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${inpatientChargesDetail.orderedEmpid}" />
            </valueReference>
        </extension>
        </#if>
        <#if inpatientChargesDetail.performDpid??>
        <!-- 执行科室 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/identifier/perform-dpid">
            <valueReference>
                <reference
                    value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${inpatientChargesDetail.performDpid}" />
            </valueReference>
        </extension>
        </#if>
        <#if inpatientChargesDetail.performEmpid??>
        <!-- 执行医生 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/identifier/perform-empid">
            <valueReference>
                <reference
                    value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${inpatientChargesDetail.performEmpid}" />
            </valueReference>
        </extension>
        </#if>
        <#if inpatientChargesDetail.chargesDetailSeq??>
        <!-- 序号 -->
        <sequence value="${inpatientChargesDetail.chargesDetailSeq}" />
        </#if>
        <type>
            <!-- 费用类型代码命名空间 -->
            <system
                value="http://www.nestvision.com/platform/app/data/v1/code/acc-code" />
            <#if inpatientChargesDetail.accCode??>
            <!-- 费用类型代码 -->
            <code value="${inpatientChargesDetail.accCode}" />
            </#if>
            <#if inpatientChargesDetail.accName??>
            <display value="${inpatientChargesDetail.accName}" />
            </#if>
        </type>
        <!-- 院内药品编码 或院内收费项目编码 -->
        <service>
            <#if inpatientChargesDetail.accCode??>
            <#if inpatientChargesDetail.accCode=='01' || inpatientChargesDetail.accCode == '02' || inpatientChargesDetail.accCode == '03' >
            <!-- 院内药品编码系统命名空间 -->
            <system
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/code/medication" />
            <#else>
            <!-- 院内收费项目编码系统命名空间 -->
            <system
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/item-code" />    
            </#if>
            </#if>
            <#if inpatientChargesDetail.chargingItemCd??>
            <code value="${inpatientChargesDetail.chargingItemCd}" />
            </#if>
            <#if inpatientChargesDetail.chargingItemName??>
            <display value="${inpatientChargesDetail.chargingItemName}" />
            </#if>
        </service>
        <!-- 对应医保项目编码 -->
        <serviceModifier>
            <!-- 医保项目编码系统 -->
            <system
                value="http://www.nestvision.com/platform/app/data/v1/code/medicalins/item-code" />
            <#if inpatientChargesDetail.medicalinsItemCode??>
            <code value="${inpatientChargesDetail.medicalinsItemCode}" />
            </#if>
            <#if inpatientChargesDetail.medicalinsItemName??>
            <display value="${inpatientChargesDetail.medicalinsItemName}" />
            </#if>
        </serviceModifier>
        <modifier>
            <!-- 报销标志（医保药物）命名空间 -->
            <system
                value="http://www.nestvision.com/platform/app/data/v1/code/medicalins/medication-category" />
            <#if inpatientChargesDetail.medicationCategory??>
            <!--报销标志代码 -->
            <code value="${inpatientChargesDetail.medicationCategory}" />
            </#if>
            <#if inpatientChargesDetail.medicationCategoryName??>
            <display value="${inpatientChargesDetail.medicationCategoryName}" />
            </#if>
        </modifier>
        <#if inpatientChargesDetail.clinCostDate??>
        <!-- 服务日期 -->
        <servicedDate value="${inpatientChargesDetail.clinCostDate?string("yyyy-MM-dd")}" />
        </#if>
        <quantity>
            <#if inpatientChargesDetail.quantityValue??>
            <!-- 数量 -->
            <value value="${inpatientChargesDetail.quantityValue}" />
            </#if>
            <#if inpatientChargesDetail.quantityUnit??>
            <!-- 单位 -->
            <unit value="${inpatientChargesDetail.quantityUnit}" />
            </#if>
        </quantity>
        <!-- 单价 -->
        <unitPrice>
            <#if inpatientChargesDetail.unitprice??>
            <value value="${inpatientChargesDetail.unitprice}" />
            </#if>
            <unit value="人民币" />
            <system value="urn:iso:std:iso:4217" />
            <code value="CYN" />
        </unitPrice>
        <!-- 金额 -->
        <net>
            <#if inpatientChargesDetail.net??>
            <value value="${inpatientChargesDetail.net}" />
            </#if>
            <unit value="人民币" />
            <system value="urn:iso:std:iso:4217" />
            <code value="CYN" />
        </net>
    </item>
    </#list>
    </#if>
    <!-- 总金额（表示同一收费单的总金额之和） -->
    <total>
        <#if total??>
        <value value="${total}" />
        </#if>
        <unit value="人民币" />
        <system value="urn:iso:std:iso:4217" />
        <code value="CNY" />
    </total>
</Claim>