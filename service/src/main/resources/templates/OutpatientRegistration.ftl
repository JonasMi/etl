<#ftl output_format="XML">
<!-- 门诊样例 -->
<Encounter xmlns="http://hl7.org/fhir">
    <#if ifObserve??>
    <!--是否留观标志 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-observe">
        <valueBoolean value="${ifObserve?string("true","false")}" />
    </extension>
    </#if>
    <#if ifRescue??>
    <!--是否抢救标志 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/if-rescue">
        <valueBoolean value="${ifRescue?string("true","false")}" />
    </extension>
    </#if>
    <#if chief??>
    <!--主诉 -->
    <extension url="http://www.nestvision.com/platform/app/data/v1/text/chief">
        <valueString value="${chief}" />
    </extension>
    </#if>
    <#if illness??>
    <!--现病史 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/illness">
        <valueString value="${illness}" />
    </extension>
    </#if>
    <#if history??>
    <!--既往史 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/history">
        <valueString value="${history}" />
    </extension>
    </#if>
    <#if perHistory??>
    <!--个人史 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/per-history">
        <valueString value="${perHistory}" />
    </extension>
    </#if>
    <#if marHistory??>
    <!--婚姻史 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/mar-history">
        <valueString value="${marHistory}" />
    </extension>
    </#if>
    <#if childHistory??>
    <!--生育史 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/child-history">
        <valueString value="${childHistory}" />
    </extension>
    </#if>
    <#if famHistory??>
    <!--家族史 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/fam-history">
        <valueString value="${famHistory}" />
    </extension>
    </#if>
    <#if phyCheckup??>
    <!--体格检查 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/phy-checkup">
        <valueString value="${phyCheckup}" />
    </extension>
    </#if>
    <#if management??>
    <!--处置 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/management">
        <valueString value="${management}" />
    </extension>
    </#if>
    <#if receiveAutographDate??>
    <!--接诊医师签名日期 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/datetime/treat-doc-date">
        <valueDateTime value="${receiveAutographDate?string("yyyy-MM-dd")}T${receiveAutographDate?string("HH:mm:ss")}" />
    </extension>
    </#if>
    <#if isLocalMark??>
    <!--是否本地标志 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/is-local-mark">
        <valueBoolean value="${isLocalMark?string("true","false")}" />
    </extension>
    </#if>
    <#if newlyMark??>
    <!--初诊标志代码CV9900267 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/newly-mark">
        <valueCode value="${newlyMark}" />
    </extension>
    </#if>
    <#if referralMark??>
    <!--是否转诊标志 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/boolean/referral-mark">
        <valueBoolean value="${referralMark?string("true","false")}" />
    </extension>
    </#if>
    <#if generalHealthMark??>
    <!--患者既往健康状况代码GBT22613 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/general-health-mark">
        <valueCode value="${generalHealthMark}" />
    </extension>
    </#if>
    <#if pastDisHis??>
    <!--既往健康状况及重要相关病史的描述 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/past-dis-his">
        <valueString value="${pastDisHis}" />
    </extension>
    </#if>
    <#if inpatChronicMark??>
    <!--患者有无慢性病史CV9900024 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/inpat-chronic-mark">
        <valueCode value="${inpatChronicMark}" />
    </extension>
    </#if>
    <#if inpatInfectMark??>
    <!--患者有无传染病史CV9900024 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/inpat-infect-mark">
        <valueCode value="${inpatInfectMark}" />
    </extension>
    </#if>
    <#if infectHistory??>
    <!--患者既往所患各种急性或慢性传染性疾病名称 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/infect-history">
        <valueString value="${infectHistory}" />
    </extension>
    </#if>
    <#if inpatTraumaMark??>
    <!--患者有无外伤史CV9900024 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/inpat-trauma-mark">
        <valueCode value="${inpatTraumaMark}" />
    </extension>
    </#if>
    <#if traumaHis??>
    <!--对患者外伤史的描述 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/trauma-his">
        <valueString value="${traumaHis}" />
    </extension>
    </#if>
    <#if disHis??>
    <!--患者既往健康状况和疾病(含外伤) 的详细描述 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/dis-his">
        <valueString value="${disHis}" />
    </extension>
    </#if>
    <#if inpatVaccinationMark??>
    <!--患者有无预防接种史CV9900024 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/inpat-vaccination-mark">
        <valueCode value="${inpatVaccinationMark}" />
    </extension>
    </#if>
    <#if vaccHis??>
    <!--患者预防接种情况的详细描述 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/vacc-his">
        <valueString value="${vaccHis}" />
    </extension>
    </#if>
    <#if inpatOpMark??>
    <!--患者有无手术史CV9900024 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/inpat-op-mark">
        <valueCode value="${inpatOpMark}" />
    </extension>
    </#if>
    <#if opHis??>
    <!--患者既往接受手术/操作经历的详细描述 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/op-his">
        <valueString value="${opHis}" />
    </extension>
    </#if>
    <#if inpatTransfusionMark??>
    <!--患者有无输血史CV9900024 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/inpat-transfusion-mark">
        <valueCode value="${inpatTransfusionMark}" />
    </extension>
    </#if>
    <#if transfusionHis??>
    <!--患者既往输血史的详细描述 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/transfusion-his">
        <valueString value="${transfusionHis}" />
    </extension>
    </#if>
    <#if inpatAlleMark??>
    <!--患者有无过敏史CV9900024 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/inpat-alle-mark">
        <valueCode value="${inpatAlleMark}" />
    </extension>
    </#if>
    <#if alleHis??>
    <!--患者既往发生过敏情况的详细描述 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/alle-his">
        <valueString value="${alleHis}" />
    </extension>
    </#if>
    <#if mensesHis??>
    <!--月经史 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/menses-his">
        <valueString value="${mensesHis}" />
    </extension>
    </#if>
    <#if bodyTemperature??>
    <!--体格检查：体温 (体温的测量值，计量单位为℃)-->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/body-temperature">
        <valueDecimal value="${bodyTemperature}" />
    </extension>
    </#if>
    <#if prFreq??>
    <!--体格检查：脉搏 (患者每分钟脉搏次数的测量值，计量单位为次/min)-->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/pr-freq">
        <valueInteger value="${prFreq}" />
    </extension>
    </#if>
    <#if breatheFreq??>
    <!--体格检查：呼吸 (患者每分钟呼吸次数的测量值，计量单位为次/min)-->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/breathe-freq">
        <valueInteger value="${breatheFreq}" />
    </extension>
    </#if>
    <#if sbp??>
    <!--体格检查：收缩压 (收缩压的测量值，计量单位为mmHg)-->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/sbp">
        <valueInteger value="${sbp}" />
    </extension>
    </#if>
    <#if dbp??>
    <!--体格检查：舒张压 (舒张压的测量值，计量单位为mmHg)-->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/dbp">
        <valueInteger value="${dbp}" />
    </extension>
    </#if>
    <#if bodyHeight??>
    <!--体格检查：身高 (患者身高的测量值，计量单位为cm)-->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/body-height">
        <valueDecimal value="${bodyHeight}" />
    </extension>
    </#if>
    <#if bodyWeight??>
    <!--体格检查：体重 (患者体重的测量值，计量单位为kg)-->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/body-weight">
        <valueDecimal value="${bodyWeight}" />
    </extension>
    </#if>
    <#if generalSituExamResult??>
    <!--体格检查：一般状况 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/general-situ-exam-result">
        <valueString value="${generalSituExamResult}" />
    </extension>
    </#if>
    <#if skin??>
    <!--体格检查：皮肤粘膜 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/skin">
        <valueString value="${skin}" />
    </extension>
    </#if>
    <#if ln??>
    <!--体格检查：淋巴结 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/ln">
        <valueString value="${ln}" />
    </extension>
    </#if>
    <#if head??>
    <!--体格检查：头部 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/head">
        <valueString value="${head}" />
    </extension>
    </#if>
    <#if neck??>
    <!--体格检查：颈部 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/neck">
        <valueString value="${neck}" />
    </extension>
    </#if>
    <#if chest??>
    <!--体格检查：胸部 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/chest">
        <valueString value="${chest}" />
    </extension>
    </#if>
    <#if lungDiag??>
    <!--体格检查：肺 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/lung-diag">
        <valueString value="${lungDiag}" />
    </extension>
    </#if>
    <#if belly??>
    <!--体格检查：腹部 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/belly">
        <valueString value="${belly}" />
    </extension>
    </#if>
    <#if dreResultDescr??>
    <!--体格检查：肛门直肠 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/dre-result-descr">
        <valueString value="${dreResultDescr}" />
    </extension>
    </#if>
    <#if anusPudendum??>
    <!--体格检查：生殖器 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/anus-pudendum">
        <valueString value="${anusPudendum}" />
    </extension>
    </#if>
    <#if spine??>
    <!--体格检查：脊椎 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/spine">
        <valueString value="${spine}" />
    </extension>
    </#if>
    <#if limbs??>
    <!--体格检查：四肢 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/limbs">
        <valueString value="${limbs}" />
    </extension>
    </#if>
    <#if mental??>
    <!--体格检查：神经系统 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/mental">
        <valueString value="${mental}" />
    </extension>
    </#if>
    <#if respiratorySys??>
    <!--体格检查：呼吸系统 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/respiratory-sys">
        <valueString value="${respiratorySys}" />
    </extension>
    </#if>
    <#if circulationSys??>
    <!--体格检查：循环系统 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/circulation-sys">
        <valueString value="${circulationSys}" />
    </extension>
    </#if>
    <#if digestiveSys??>
    <!--体格检查：消化系统 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/digestive-sys">
        <valueString value="${digestiveSys}" />
    </extension>
    </#if>
    <#if urinarySys??>
    <!--体格检查：泌尿系统 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/urinary-sys">
        <valueString value="${urinarySys}" />
    </extension>
    </#if>
    <#if hemopoieticSys??>
    <!--体格检查：造血系统 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/hemopoietic-sys">
        <valueString value="${hemopoieticSys}" />
    </extension>
    </#if>
    <#if enocrineMetabolism??>
    <!--体格检查：内分泌及代谢 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/endocrine-metabolism">
        <valueString value="${enocrineMetabolism}" />
    </extension>
    </#if>
    <#if musculoskeletalSys??>
    <!--体格检查：肌肉骨骼系统 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/musculoskeletal-sys">
        <valueString value="${musculoskeletalSys}" />
    </extension>
    </#if>
    <#if ac??>
    <!--患者腹部周长的测量值(计量单位为cm)-->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/number/ac">
        <valueDecimal value="${ac}" />
    </extension>
    </#if>
    <#if specialistChecks??>
    <!--专科情况检查 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/specialist-checks">
        <valueString value="${specialistChecks}" />
    </extension>
    </#if>
    <#if therapeuticPrinciples??>
    <!--治则治法 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/therapeutic-principles">
        <valueString value="${therapeuticPrinciples}" />
    </extension>
    </#if>
    <#if dialectProof??>
    <!--辨证依据 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/dialect-proof">
        <valueString value="${dialectProof}" />
    </extension>
    </#if>
    <#if cnFourResult??>
    <!--中医"四诊"观察结果 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/cn-four-result">
        <valueString value="${cnFourResult}" />
    </extension>
    </#if>
    <#if otherMedicalTreatment??>
    <!--其他医学处置 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/other-medical-treatment">
        <valueString value="${otherMedicalTreatment}" />
    </extension>
    </#if>
    <#if healthProblemEval??>
    <!--健康问题评估 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/health-problem-eval">
        <valueString value="${healthProblemEval}" />
    </extension>
    </#if>
    <#if healthServiceDemand??>
    <!--卫生服务要求 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/health-service-demand">
        <valueString value="${healthServiceDemand}" />
    </extension>
    </#if>
    <#if consultQuestion??>
    <!--咨询问题 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/text/consult-question">
        <valueString value="${consultQuestion}" />
    </extension>
    </#if>
    <#if outCode??>
    <!--患者去向代码CV9900291 -->
    <extension
        url="http://www.nestvision.com/platform/app/data/v1/code/out-code">
        <valueCode value="${outCode}" />
    </extension>
    </#if>
    <#if outpatientRegistrationId??>
    <identifier>
        <system
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/outpatient-registration-id" />
        <!-- 原系统门诊登记流水号 -->
        <value value="${outpatientRegistrationId}" />
    </identifier>
    </#if>
    <!-- 门诊标志:已登记 -->
    <status value="arrived" />
    <!-- 就诊类型:门诊 -->
    <class value="outpatient" />
    <patient>
        <#if patientId??>
        <!-- 院内患者ID -->
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/patient-id|${patientId}" />
        </#if>
        <#if patientName??>
        <!-- 患者姓名 -->
        <display value="${patientName}" />
        </#if>
    </patient>
    <participant>
        <type>
            <coding>
                <!-- 角色代码命名空间 -->
                <system value="http://hl7.org/fhir/v3/ParticipationType" />
                <!-- 角色代码：接诊医生 -->
                <code value="REFT" />
                <display value="接诊医生" />
            </coding>
        </type>
        <#if receiveEmployeeId??>
        <!-- 接诊医生id -->
        <individual>
            <reference
                value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/employee-id|${receiveEmployeeId}" />
        </individual>
        </#if>
</participant>
    <#if registerId??>
    <!-- 挂号信息 -->
    <appointment>
        <reference
            value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/register-id|${registerId}" />
    </appointment>
    </#if>
    <#if receiveDate??>
    <period>
        <!-- 接诊时间 -->
        <start value="${receiveDate?string("yyyy-MM-dd")}T${receiveDate?string("HH:mm:ss")}" />
    </period>
    </#if>
    <#if serviceprovider??>
    <!-- 接诊科室 -->
    <serviceProvider>
        <reference value="http://www.nestvision.com/entity/hospital/${upHospital}/${developerSystemType}/${developer}/v1/identifier/department-id|${serviceprovider}"/>
    </serviceProvider>
    </#if>
</Encounter>