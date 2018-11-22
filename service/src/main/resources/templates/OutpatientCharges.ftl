<#ftl output_format="XML">
<!-- 门诊结算示例 -->
<Claim xmlns="http://hl7.org/fhir">
    <!-- 农合/医保流水号 -->
    <#if medicalinsRuralcmsMark??>
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/insurance-number">
        <valueIdentifier>
            <!-- 医保流水号名字空间，农合流水号名字空间使用 http://www.nestvision.com/platform/app/data/v1/identifier/ruralcms -->
            <#if medicalinsRuralcmsMark==2>
            <system value="http://www.nestvision.com/platform/app/data/v1/identifier/medicalins" />
            </#if>
            <#if medicalinsRuralcmsMark==1>
            <system value="http://www.nestvision.com/platform/app/data/v1/identifier/ruralcms" />    
            </#if>
            <#if insuranceNumber??>
            <!-- 农合/医保流水号 -->
            <value value="${insuranceNumber}" />
            </#if>
        </valueIdentifier>
    </extension>
    </#if>
    <#if outpatientRegistrationId??>
    <!-- 门诊流水号 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/identifier/reg-pavisit-id">
        <valueReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/outpatient-registration-id|${outpatientRegistrationId}" />
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
    <#if medicalInstitutionsType??>
    <!-- 医疗机构类型 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/code/medical-institutions-type">
		<valueCode value="${medicalInstitutionsType}" />
	</extension>
	</#if>
    <#if receivables??>
	<!-- 收款单位 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/code/receivables">
		<valueString value="${receivables}" />
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
    
    
    <#if medicalInstitutionsType??>
    <!-- 医疗机构类型 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/medical-institutions-type">
		<valueString value="${medicalInstitutionsType}" />
	</extension>
	</#if>
	<#if receivables??>
	<!-- 收款单位 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/text/receivables">
		<valueString value="${receivables}" />
	</extension>
	</#if>
	<#if outpatientLargePayment??>
	<!-- 门诊大额支付 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/outpatient-large-payment">
		<valueDecimal value="${outpatientLargePayment}" />
	</extension>
	</#if>
	<#if retirementSupplementaryPayment??>
	<!-- 退休补充支付 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/retirement-supplementary-payment">
		<valueDecimal value="${retirementSupplementaryPayment}" />
	</extension>
	</#if>
	<#if remnantSubsidyPayments??>
	<!-- 残军补助支付 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/remnant-subsidy-payments">
		<valueDecimal value="${remnantSubsidyPayments}" />
	</extension>
	</#if>
	<#if unitSupplementaryInsurancePayments??>
	<!-- 单位补充险（原公疗）支付 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/unit-supplementary-insurance-payments">
		<valueDecimal value="${unitSupplementaryInsurancePayments}" />
	</extension>
	</#if>
	<#if midwaySettlementAmount??>
	<!-- 医疗保险范围内金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/midway-settlement-amount">
		<valueDecimal value="${midwaySettlementAmount}" />
	</extension>
	</#if>
	<#if aaimiAmount??>
	<!-- 累计医保内围内金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/aaimi-amount">
		<valueDecimal value="${aaimiAmount}" />
	</extension>
	</#if>
	<#if aoptp??>
	<!-- 年度门诊大额累计支付 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/aoptp">
		<valueDecimal value="${aoptp}" />
	</extension>
	</#if>
	<#if personalAccountBalance??>
	<!-- 个人账户余额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/personal-account-balance">
		<valueDecimal value="${personalAccountBalance}" />
	</extension>
	</#if>
	<#if selfPaymentOne??>
	<!-- 个人自付一 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/self-payment-one">
		<valueDecimal value="${selfPaymentOne}" />
	</extension>
	</#if>
	<#if payAmount??>
	<!-- 起付金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/pay-amount">
		<valueDecimal value="${payAmount}" />
	</extension>
	</#if>
	<#if superCappingAmount??>
	<!-- 超封顶金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/super-capping-amount">
		<valueDecimal value="${superCappingAmount}" />
	</extension>
	</#if>
	<#if selfPaymentTwo??>
	<!-- 个人自付二 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/self-payment-two">
		<valueDecimal value="${selfPaymentTwo}" />
	</extension>
	</#if>
	<#if selfExpenseAmount??>
	<!-- 个人支付自费金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/self-expense-amount">
		<valueDecimal value="${selfExpenseAmount}" />
	</extension>
	</#if>
	<#if midwaySettlementPayAmount??>
	<!-- 医疗保险基金支付金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/midway-settlement-pay_amount">
		<valueDecimal value="${midwaySettlementPayAmount}" />
	</extension>
	</#if>
	<#if cashPaymentAmount??>
	<!-- 本次个人现金支付金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/cash-payment-amount">
		<valueDecimal value="${cashPaymentAmount}" />
	</extension>
	</#if>
	<#if accountPaymentAmount??>
	<!-- 本次个人账户支付金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/account-payment-amount">
		<valueDecimal value="${accountPaymentAmount}" />
	</extension>
	</#if>
    <#if outpatientLargePayment??>
    <!-- 门诊大额支付 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/outpatient-large-payment">
		<valueDecimal value="${outpatientLargePayment}" />
	</extension>
	</#if>
    <#if retirementSupplementaryPayment??>
	<!-- 退休补充支付 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/retirement-supplementary-payment">
		<valueDecimal value="${retirementSupplementaryPayment}" />
	</extension>
	</#if>
    <#if remnantSubsidyPayment??>
	<!-- 参军补助支付 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/remnant-subsidy-payment">
		<valueDecimal value="${remnantSubsidyPayment}" />
	</extension>
	</#if>
    <#if unitSupplementaryInsurancePayments??>
	<!-- 单位补充险（原公疗）支付 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/unit-supplementary-insurance-payments">
		<valueDecimal value="${unitSupplementaryInsurancePayments}" />
	</extension>
	</#if>
    <#if midwaySettlementAmount??>
	<!-- 医疗保险范围内金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/midway-settlement-amount">
		<valueDecimal value="${midwaySettlementAmount}" />
	</extension>
	</#if>
    <#if aaimiAmount??>
	<!-- 累计医保内围内金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/aaimi-amount">
		<valueDecimal value="${aaimiAmount}" />
	</extension>
	</#if>
    <#if aoptp??>
	<!-- 年度门诊大额累计支付 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/aoptp">
		<valueDecimal value="${aoptp}" />
	</extension>
	</#if>
    <#if personalAccountBalance??>
	<!-- 个人账户余额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/personal-account-balance">
		<valueDecimal value="${personalAccountBalance}" />
	</extension>
	</#if>
    <#if selfPaymentOne??>
	<!-- 个人自付 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/self-payment-one">
		<valueDecimal value="${selfPaymentOne}" />
	</extension>
	</#if>
    <#if payAmount??>
	<!-- 起付金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/pay-amount">
		<valueDecimal value="${payAmount}" />
	</extension>
	</#if>
    <#if superCappingAmount??>
	<!-- 超封顶金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/super-capping-amount">
		<valueDecimal value="${superCappingAmount}" />
	</extension>
	</#if>
    <#if selfPaymentTwo??>
	<!-- 个人自付二 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/self-payment-two">
		<valueDecimal value="${selfPaymentTwo}" />
	</extension>
	</#if>
    <#if selfExpenseAmount??>
	<!-- 个人支付自费金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/self-expense-amount">
		<valueDecimal value="${selfExpenseAmount}" />
	</extension>
	</#if>
    <#if midwaySettlementPayAmount??>
	<!-- 医疗保险基金支付金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/midway-settlement-pay-amount">
		<valueDecimal value="${midwaySettlementPayAmount}" />
	</extension>
	</#if>
    <#if cashPaymentAmount??>
	<!-- 本次个人现金支付金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/cash-payment-amount">
		<valueDecimal value="${cashPaymentAmount}" />
	</extension>
	</#if>
    <#if accountPaymentAmount??>
	<!-- 本次个人账户支付金额 -->
	<extension
		url="http://www.nestvision.com/platform/app/data/v1/number/account-payment-amount">
		<valueDecimal value="${accountPaymentAmount}" />
	</extension>
	</#if>
    
    <!-- 门诊费用支付信息集 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/extension/cli-register-paymays">
        <#if outpatientChargesPayDetails??>
        <#list outpatientChargesPayDetails as outpatientChargesPayDetail>
        <!-- 门诊费用支付信息1 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/extension/cli-register-paymay">
            <!-- 结算方式代码CV0710004 -->
            <#if outpatientChargesPayDetail.settlementCode??>
            <extension url="urn:oid:2.16.156.10011.2.3.1.198">
                <valueCode value="${outpatientChargesPayDetail.settlementCode}" />
            </extension>
            </#if>
            <#if outpatientChargesPayDetail.payAmount??>
            <!-- 支付金额 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/number/pay-amount">
                <valueDecimal value="${outpatientChargesPayDetail.payAmount}" />
            </extension>
            </#if>
            <#if outpatientChargesPayDetail.paymentNotes??>
            <!-- 支付备注 -->
            <extension
                url="http://www.nestvision.com/platform/app/data/v1/text/payment-notes">
                <valueString value="${outpatientChargesPayDetail.paymentNotes}" />
            </extension>
            </#if>
        </extension>
        </#list>
        </#if>
    </extension>
    
<!-- 页数（针对于明细项多的情况分批上传的批次号，从1开始）-->
    <#if pageNum??>
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/page-num">
        <valueInteger value="${pageNum}" />
    </extension>
    </#if>
    <!-- 指明是门诊结算 -->
    <type value="professional" />
    <#if outpatientChargesId??>
    <!-- 原系统门诊收费单id号 -->
    <identifier>
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/outpatient-charges-id" />
        <value value="${outpatientChargesId}" />
    </identifier>
    </#if>
    <#if created??>
    <!-- 报销日期 -->
    <created value="${created?string("yyyy-MM-dd")}" />
    </#if>
    <#if originalChargesId??>
    <!-- 原收费单号id，仅当此单为红票时有用 -->
    <related>
        <claimReference>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/outpatient-charges-id|${originalChargesId}" />
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
    <#if outpatientChargesDetails ??>
    <#list outpatientChargesDetails as outpatientChargesDetail>
    <item>
        <#if outpatientChargesDetail.recipeId??>
        <!-- 处方号 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/identifier/recipe-id">
            <valueString value="${outpatientChargesDetail.recipeId}" />
        </extension>
        </#if>
        <#if outpatientChargesDetail.submitRatio??>
        <!-- 报销比例 % -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/number/submit-ratio">
            <valueDecimal value="${outpatientChargesDetail.submitRatio}" />
        </extension>
        </#if>
        <#if outpatientChargesDetail.amountReimbursement??>
        <!-- 报销金额 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/number/amount-reimbursement">
            <valueDecimal value="${outpatientChargesDetail.amountReimbursement}" />
        </extension>
        </#if>
        <#if outpatientChargesDetail.selfAmount??>
        <!-- 自费金额 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/number/self-amount">
            <valueDecimal value="${outpatientChargesDetail.selfAmount}" />
        </extension>
        </#if>
        <#if outpatientChargesDetail.itemSpec??>
        <!-- 项目规格 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/text/item-spec">
            <valueString value="${outpatientChargesDetail.itemSpec}" />
        </extension>
        </#if>
        <#if outpatientChargesDetail.clinCostDate??>
        <!-- 收费时间 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/datetime/clin-cost-date">
            <valueDateTime value="${outpatientChargesDetail.clinCostDate?string("yyyy-MM-dd")}T${outpatientChargesDetail.clinCostDate?string("HH:mm:ss")}" />
        </extension>
        </#if>
        <#if outpatientChargesDetail.orderedDpid??>
        <!-- 开单科室 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/identifier/ordered-dpid">
            <valueReference>
                <reference
                    value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${outpatientChargesDetail.orderedDpid}" />
            </valueReference>
        </extension>
        </#if>
        <#if outpatientChargesDetail.orderedEmpid??>
        <!-- 开单医生 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/identifier/ordered-empid">
            <valueReference>
                <reference
                    value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${outpatientChargesDetail.orderedEmpid}" />
            </valueReference>
        </extension>
        </#if>
        <#if outpatientChargesDetail.performDpid??>
        <!-- 执行科室 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/identifier/perform-dpid">
            <valueReference>
                <reference
                    value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${outpatientChargesDetail.performDpid}" />
            </valueReference>
        </extension>
        </#if>
        <#if outpatientChargesDetail.performEmpid??>
        <!-- 执行医生 -->
        <extension
            url="http://www.nestvision.com/platform/app/data/v1/identifier/perform-empid">
            <valueReference>
                <reference
                    value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${outpatientChargesDetail.performEmpid}" />
            </valueReference>
        </extension>
        </#if>
        <#if outpatientChargesDetail.chargesDetailSeq??>
        <!-- 序号 -->
        <sequence value="${outpatientChargesDetail.chargesDetailSeq}" />
        </#if>
        <type>
            <!-- 费用类型代码命名空间 -->
            <system
                value="http://www.nestvision.com/platform/app/data/v1/code/acc-code" />
            <#if outpatientChargesDetail.accCode??>
            <!-- 费用类型代码 -->
            <code value="${outpatientChargesDetail.accCode}" />
            </#if>
            <#if outpatientChargesDetail.accName??>
            <display value="${outpatientChargesDetail.accName}" />
            </#if>
        </type>
        <!-- 院内药品编码 或院内收费项目编码 -->
        <service>
            <#if outpatientChargesDetail.accCode??>
            <#if outpatientChargesDetail.accCode=='01' || outpatientChargesDetail.accCode == '02' || outpatientChargesDetail.accCode == '03' >
            <!-- 院内药品编码系统命名空间 -->
            <system
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/code/medication" />
            <#else>
            <!-- 院内收费项目编码系统命名空间 -->
            <system
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/item-code" />    
            </#if>
            </#if>
            <#if outpatientChargesDetail.chargingItemCd??>
            <code value="${outpatientChargesDetail.chargingItemCd}" />
            </#if>
            <#if outpatientChargesDetail.chargingItemName??>
            <display value="${outpatientChargesDetail.chargingItemName}" />
            </#if>
        </service>
        <!-- 对应医保项目编码 -->
        <serviceModifier>
            <!-- 医保项目编码系统 -->
            <system
                value="http://www.nestvision.com/platform/app/data/v1/code/medicalins/item-code" />
            <#if outpatientChargesDetail.medicalinsItemCode??>
            <code value="${outpatientChargesDetail.medicalinsItemCode}" />
            </#if>
            <#if outpatientChargesDetail.medicalinsItemCode??>
            <display value="${outpatientChargesDetail.medicalinsItemName}" />
            </#if>
        </serviceModifier>
        <modifier>
            <!-- 报销标志（医保药物）命名空间 -->
            <system
                value="http://www.nestvision.com/platform/app/data/v1/code/medicalins/medication-category" />
            <#if outpatientChargesDetail.medicationCategory??>
            <!-- 报销标志代码 -->
            <code value="${outpatientChargesDetail.medicationCategory}" />
            </#if>
            <#if outpatientChargesDetail.medicationCategoryName??>
            <display value="${outpatientChargesDetail.medicationCategoryName}" />
            </#if>
        </modifier>
        <#if outpatientChargesDetail.clinCostDate??>
        <!--服务日期 -->
        <servicedDate value="${outpatientChargesDetail.clinCostDate?string("yyyy-MM-dd")}" />
        </#if>
        <quantity>
            <#if outpatientChargesDetail.quantityValue??>
            <!-- 数量 -->
            <value value="${outpatientChargesDetail.quantityValue}" />
            </#if>
            <#if outpatientChargesDetail.quantityUnit??>
            <!-- 单位 -->
            <unit value="${outpatientChargesDetail.quantityUnit}" />
            </#if>
        </quantity>
        <#if outpatientChargesDetail.unitprice??>
        <!-- 单价 -->
        <unitPrice>
            <value value="${outpatientChargesDetail.unitprice}" />
            <unit value="人民币" />
            <system value="urn:iso:std:iso:4217" />
            <code value="CYN" />
        </unitPrice>
        </#if>
        <#if outpatientChargesDetail.net??>
        <!-- 金额 -->
        <net>
            <value value="${outpatientChargesDetail.net}" />
            <unit value="人民币" />
            <system value="urn:iso:std:iso:4217" />
            <code value="CYN" />
        </net>
        </#if>
    </item>
    </#list>
    </#if>
    <!-- 总金额（表示同一收费单的总金额之和） -->
    <#if total??>
    <total>
        <value value="${total}" />
        <unit value="人民币元" />
        <system value="urn:iso:std:iso:4217" />
        <code value="CNY" />
    </total>
    </#if>
</Claim>