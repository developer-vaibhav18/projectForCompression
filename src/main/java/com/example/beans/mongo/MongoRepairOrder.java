package com.example.beans.mongo;

import com.example.beans.redis.RedisRepairOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("repairOrder")
public class MongoRepairOrder {
    @Id
    private String id;
    private String repairOrder;

    public MongoRepairOrder(RedisRepairOrder redisRepairOrder) {
        this.id = redisRepairOrder.getId();
        this.repairOrder = redisRepairOrder.getRepairOrder();
    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class AdditionalDetail{
    //        public CustomerInfo customerInfo;
    //        public DropOffCustomerInfo dropOffCustomerInfo;
    //        public BillingContactCustomerInfo billingContactCustomerInfo;
    //        public String label;
    //        public VehicleInfo vehicleInfo;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class Address{
    //        public String id;
    //        public String line1;
    //        public String line2;
    //        public String postalCode;
    //        public String city;
    //        public String state;
    //        public String country;
    //        public Object residentType;
    //        public Object monthlyRentOrMortgageAmount;
    //        public String county;
    //        public Object periodOfResidence;
    //        public Object mortageValue;
    //        public Object routeNumber;
    //        public Integer addressType;
    //        public Integer startDate;
    //        public Integer endDate;
    //        @JsonProperty("default")
    //        public Boolean mydefault;
    //        public Object currentAddress;
    //    }
    //
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class Address2{
    //        public String id;
    //        public String line1;
    //        public String line2;
    //        public String postalCode;
    //        public String city;
    //        public String state;
    //        public String country;
    //        public Object residentType;
    //        public Object monthlyRentOrMortgageAmount;
    //        public String county;
    //        public Object periodOfResidence;
    //        public Object mortageValue;
    //        public Object routeNumber;
    //        public Integer addressType;
    //        public Integer startDate;
    //        public Integer endDate;
    //        @JsonProperty("default")
    //        public Boolean mydefault;
    //        public Object currentAddress;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class Amount{
    //        public Integer amount;
    //        public String currency;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class BigDecimalTax{
    //        public Object laborOnlyTaxHighPrecision;
    //        public Object partOnlyTaxHighPrecision;
    //        public Object serviceFeeTaxHighPrecision;
    //        public Object partFeeTaxHighPrecision;
    //        public Object feeTaxHighPrecision;
    //        public Object partTaxHighPrecision;
    //        public Object serviceTaxHighPrecision;
    //        public Object deductibleTaxHighPrecision;
    //        public Object thirdPartyTaxHighPrecision;
    //        public Object flatSplitTaxHighPrecision;
    //        public Object subletTaxHighPrecision;
    //        public Object subletLaborTaxHighPrecision;
    //        public Object subletPartTaxHighPrecision;
    //        public Object residueTaxHighPrecision;
    //        public Object totalNonSplitItemsTaxHighPrecision;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class BillingContactCustomerInfo{
    //        public String id;
    //        public Object externalId;
    //        public String firstName;
    //        public String lastName;
    //        public String preferredLanguage;
    //        public String companyName;
    //        public String email;
    //        public Object note;
    //        public Object customerCommentMetaData;
    //        public String customerNumber;
    //        public Boolean taxExempted;
    //        public Object reasonForTaxExemption;
    //        public Object taxExemptNumber;
    //        public String customerType;
    //        public Integer customerTypeInteger;
    //        public String customerDetailType;
    //        public String primaryPhone;
    //        public ArrayList<Address> addresses;
    //        public Address address;
    //        public ArrayList<Phone> phones;
    //        public String preferredCommunicationMode;
    //        public Integer preferredContactType;
    //        public Boolean optInText;
    //        public Boolean optInEmail;
    //        public Object originalCustomerInfo;
    //        public Object customerTaxOverride;
    //        public Boolean deleted;
    //        public Object deleteReason;
    //        public Integer deleteTimestamp;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class CostPricingDetail{
    //        public String pricingType;
    //        public Integer flatPrice;
    //        public Object basePrice;
    //        public Object percentage;
    //        public Object minAmount;
    //        public Object maxAmount;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class CpAmounts{
    //        public Integer closedTime;
    //        public Object closedBy;
    //        public Integer amount;
    //        public Integer estimateAmount;
    //        public Integer laborAmount;
    //        public Integer partsAmount;
    //        public Integer partCoreAmount;
    //        public Integer partCoreReturnAmount;
    //        public Integer laborCostAmount;
    //        public Integer partCostAmount;
    //        public Integer adjustedPartCostAmount;
    //        public Integer adjustedLaborCostAmount;
    //        public Integer initialLaborCostAmount;
    //        public Integer serviceTotalAmount;
    //        public Integer partsTotalAmount;
    //        public Integer serviceFeeAmount;
    //        public Integer serviceFeeCostAmount;
    //        public Integer partFeeAmount;
    //        public Integer partFeeCostAmount;
    //        public Integer serviceCouponsAmount;
    //        public Integer partCouponsAmount;
    //        public Integer deductibleAmount;
    //        public Integer serviceTax;
    //        public Integer serviceFeeTax;
    //        public Integer partTax;
    //        public Integer partFeeTax;
    //        public Integer subletTax;
    //        public Integer deductibleTax;
    //        public Integer thirdPartyTax;
    //        public Integer subletLaborTax;
    //        public Integer subletPartTax;
    //        public Integer flatSplitAmount;
    //        public Integer flatSplitAmountTax;
    //        public Integer subletSaleAmount;
    //        public Integer subletLaborSaleAmount;
    //        public Integer subletPartSaleAmount;
    //        public Integer subletCostAmount;
    //        public Integer subletLaborCostAmount;
    //        public Integer subletPartCostAmount;
    //        public Integer serviceCouponsAmountForGrossCalculation;
    //        public Integer partCouponsAmountForGrossCalculation;
    //        public Integer roCouponsAmount;
    //        public Integer roCouponTax;
    //        public Integer roFeeAmount;
    //        public Integer roFeeCostAmount;
    //        public Integer roFeeTax;
    //        public Integer roFeeTaxableAmount;
    //        public ArrayList<Object> paySplitShares;
    //        public Integer totalBillingTimeInSeconds;
    //        public Integer totalDiscount;
    //        public Integer residueTax;
    //        public Integer totalNonSplitItemsTax;
    //        public Integer preTaxTotalWithoutCoupons;
    //        public Integer preTaxCostTotalWithoutCoupons;
    //        public Integer totalFees;
    //        public Integer preTaxTotal;
    //        public Integer postTaxTotal;
    //        public Integer totalTax;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class CustomerInfo{
    //        public String id;
    //        public Object externalId;
    //        public String firstName;
    //        public String lastName;
    //        public String preferredLanguage;
    //        public String companyName;
    //        public String email;
    //        public Object note;
    //        public Object customerCommentMetaData;
    //        public String customerNumber;
    //        public Boolean taxExempted;
    //        public Object reasonForTaxExemption;
    //        public Object taxExemptNumber;
    //        public String customerType;
    //        public Integer customerTypeInteger;
    //        public String customerDetailType;
    //        public String primaryPhone;
    //        public ArrayList<Address> addresses;
    //        public Address address;
    //        public ArrayList<Phone> phones;
    //        public String preferredCommunicationMode;
    //        public Integer preferredContactType;
    //        public Boolean optInText;
    //        public Boolean optInEmail;
    //        public Object originalCustomerInfo;
    //        public Object customerTaxOverride;
    //        public Boolean deleted;
    //        public Object deleteReason;
    //        public Integer deleteTimestamp;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class DealerConfigDetail{
    //        public String id;
    //        public TaxConfigDetails taxConfigDetails;
    //        public String roundingMode;
    //        public String dealerId;
    //        public String tenantId;
    //        public String siteId;
    //        public Long createdTime;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class DropOffCustomerInfo{
    //        public String id;
    //        public Object externalId;
    //        public String firstName;
    //        public String lastName;
    //        public String preferredLanguage;
    //        public String companyName;
    //        public String email;
    //        public Object note;
    //        public Object customerCommentMetaData;
    //        public String customerNumber;
    //        public Boolean taxExempted;
    //        public Object reasonForTaxExemption;
    //        public Object taxExemptNumber;
    //        public String customerType;
    //        public Integer customerTypeInteger;
    //        public String customerDetailType;
    //        public String primaryPhone;
    //        public ArrayList<Address> addresses;
    //        public Address address;
    //        public ArrayList<Phone> phones;
    //        public String preferredCommunicationMode;
    //        public Integer preferredContactType;
    //        public Boolean optInText;
    //        public Boolean optInEmail;
    //        public Object originalCustomerInfo;
    //        public Object customerTaxOverride;
    //        public Boolean deleted;
    //        public Object deleteReason;
    //        public Integer deleteTimestamp;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class Estimate{
    //        public Integer revisionNumber;
    //        public Integer pdfVersion;
    //        public Long revisedTime;
    //        public Object comment;
    //        public ArrayList<String> jobIds;
    //        public String revisedBy;
    //        public Object approvalDetails;
    //        public Object customerPay;
    //        public Object internalPay;
    //        public Object warrantyPay;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class Fee{
    //        public String id;
    //        public String feeId;
    //        public String feeCode;
    //        public String description;
    //        public Amount amount;
    //        public ArrayList<String> overrideFlags;
    //        public SalePricingDetail salePricingDetail;
    //        public CostPricingDetail costPricingDetail;
    //        public Object overriddenSaleAmount;
    //        public Object overriddenCostAmount;
    //        public ArrayList<Object> excludeOpcodes;
    //        public ArrayList<Object> excludeServiceTypeIds;
    //        public String costCenterSplitType;
    //        public Object costCenters;
    //        public Boolean costCentreOverridden;
    //        public Object linkedOperationId;
    //        public ArrayList<TaxConfig> taxConfigs;
    //        public String pricingType;
    //        public Double flatPrice;
    //        public Integer percentage;
    //        public Boolean minMaxLimits;
    //        public Double minAmount;
    //        public Double maxAmount;
    //        public Boolean overridden;
    //        public Object criteria;
    //        public String pricingMethod;
    //        public Object gridConfigId;
    //        public String code;
    //        public String type;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class FeeCalculationResult{
    //        public String id;
    //        public String feeId;
    //        public String feeCode;
    //        public String levelId;
    //        public String levelType;
    //        public Integer feeAmount;
    //        public Integer feeCostAmount;
    //        public Boolean taxable;
    //        public ArrayList<TaxConfig> taxConfigs;
    //        public String payType;
    //        public String type;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class PaySplitTotalsV3{
    //        public CpAmounts cpAmounts;
    //        public ArrayList<Object> insurances;
    //        public Object ipAmounts;
    //        public Object wpAmounts;
    //        public Integer totalInsuranceAmount;
    //        public Integer totalDeductible;
    //        public Integer cpAmountFromWarrantySplit;
    //        public Integer cpTaxFromWarrantySplit;
    //        public Integer cpAmountFromInternalSplit;
    //        public Integer cpTaxFromInternalSplit;
    //        public ArrayList<Object> couponsResult;
    //        public ArrayList<FeeCalculationResult> feeCalculationResults;
    //        public ArrayList<TaxCalculationResult> taxCalculationResults;
    //        public ArrayList<TaxCodeTaxAmount> taxCodeTaxAmounts;
    //        public Integer insurancePayableAmount;
    //        public Integer insuranceApprovedAmount;
    //        public Integer totalLaborAmount;
    //        public Integer totalBillingTimeInSeconds;
    //        public Integer totalCpAmount;
    //        public Integer totalWpAmount;
    //        public Integer totalIpAmount;
    //        public Integer totalAmount;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class Phone{
    //        public Integer phoneType;
    //        public String number;
    //        public Object countryCode;
    //        public Object extension;
    //        public Boolean isPrimary;
    //        public Boolean optOutOfMarketingCalls;
    //    }
    //
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //
    //    public class RoActivityTechWorkInfo{
    //        public String roTechWorkStatus;
    //        public Long lastActivityTechTime;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class Root{
    //        public MongoRepairOrder repairOrder;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class SalePricingDetail{
    //        public String pricingType;
    //        public Integer flatPrice;
    //        public Object basePrice;
    //        public Integer percentage;
    //        public Object minAmount;
    //        public Object maxAmount;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class TagDetail{
    //        public String tag;
    //        public String tagType;
    //        public String tagAdditionType;
    //        public String tagKeyWord;
    //        public Object addedTime;
    //        public String addedByUserId;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class TaxableAmounts{
    //        public Integer nonTaxableLaborAmount;
    //        public Integer taxableLaborAmount;
    //        public Integer nonTaxablePartsAmount;
    //        public Integer taxablePartsAmount;
    //        public Integer nonTaxableSubletSaleAmount;
    //        public Integer taxableSubletSaleAmount;
    //        public Integer nonTaxableSubletLaborSaleAmount;
    //        public Integer taxableSubletLaborSaleAmount;
    //        public Integer nonTaxableSubletPartSaleAmount;
    //        public Integer taxableSubletPartSaleAmount;
    //        public Integer nonTaxableServiceFeeAmount;
    //        public Integer taxableServiceFeeAmount;
    //        public Integer nonTaxablePartFeeAmount;
    //        public Integer taxablePartFeeAmount;
    //        public Integer taxableDeductibleAmount;
    //        public Integer nonTaxableDeductibleAmount;
    //        public Integer taxableThirdPartyAmount;
    //        public Integer nonTaxableThirdPartyAmount;
    //        public Integer taxableFlatSplitAmount;
    //        public Integer nonTaxableFlatSplitAmount;
    //        public Integer nonTaxableServiceCouponsAmount;
    //        public Integer nonTaxablePartCouponsAmount;
    //        public String levelId;
    //        public String taxLevel;
    //        public String taxType;
    //        public Object taxPercentage;
    //        public Object preTaxSplit;
    //        public String payType;
    //        public Object taxCode;
    //        public Boolean laborTaxable;
    //        public Boolean partsTaxable;
    //        public Boolean subletLaborTaxable;
    //        public Boolean subletPartTaxable;
    //        public Boolean subletTaxable;
    //        public Boolean saleTaxableForSplitJob;
    //        public Boolean coreTaxable;
    //        public Boolean coreReturnTaxable;
    //        public Integer totalTaxableAmount;
    //        public Integer totalNonTaxableAmount;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class TaxCalculationResult{
    //        public TaxableAmounts taxableAmounts;
    //        public Integer laborOnlyTax;
    //        public Integer partOnlyTax;
    //        public Integer serviceFeeTax;
    //        public Integer partFeeTax;
    //        public Integer feeTax;
    //        public Integer partTax;
    //        public Integer serviceTax;
    //        public Integer deductibleTax;
    //        public Integer thirdPartyTax;
    //        public Integer flatSplitTax;
    //        public Integer subletTax;
    //        public Integer subletLaborTax;
    //        public Integer subletPartTax;
    //        public Integer residueTax;
    //        public Integer totalNonSplitItemsTax;
    //        public Integer totalComputedTax;
    //        public Integer customerPayableTax;
    //        public String taxLevel;
    //        public String levelId;
    //        public String taxType;
    //        public String payType;
    //        public BigDecimalTax bigDecimalTax;
    //        public TotalCustomerPayableTax totalCustomerPayableTax;
    //        public TotalTax totalTax;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class TaxCodeTaxAmount{
    //        public String levelId;
    //        public String levelType;
    //        public String taxCode;
    //        public String taxCodeType;
    //        public String payType;
    //        public Object harmonized;
    //        public String taxCategory;
    //        public Integer laborAmount;
    //        public Integer feeAmount;
    //        public Integer subletLaborAmount;
    //        public Integer subletPartAmount;
    //        public Integer partAmount;
    //        public Integer partFeeAmount;
    //        public Integer deductibleAmount;
    //        public Integer thirdPartyAmount;
    //        public Integer flatSplitAmount;
    //        public Integer totalAmount;
    //        public Integer nonSplitAmount;
    //        public Integer nonTaxableServiceCouponsAmount;
    //        public Integer nonTaxablePartCouponsAmount;
    //        public Integer laborTax;
    //        public Integer feeTax;
    //        public Integer subletLaborTax;
    //        public Integer subletPartTax;
    //        public Integer partTax;
    //        public Integer partFeeTax;
    //        public Integer deductibleTax;
    //        public Integer thirdPartyTax;
    //        public Integer flatSplitAmountTax;
    //        public Integer nonSplitAmountTax;
    //        public Integer totalTax;
    //        public Object subCodeAmounts;
    //        public Object preTaxSplit;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class TaxConfig{
    //        public String payType;
    //        public String taxRegimeType;
    //        public Boolean taxable;
    //    }
    //
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public static class TaxLabelConfig{
    //        public String label;
    //        public String type;
    //        public Integer percentage;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class TotalCustomerPayableTax{
    //        public Integer amount;
    //        public String currency;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class TotalPrepaidAmount{
    //        public Integer amount;
    //        public String currency;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class TotalTax{
    //        public Integer amount;
    //        public String currency;
    //    }
    //    @Data
    //    @AllArgsConstructor
    //    @NoArgsConstructor
    //    public class VehicleInfo{
    //        public String id;
    //        public String year;
    //        public String make;
    //        public String makeId;
    //        public String makeLabel;
    //        public String model;
    //        public Object displayModel;
    //        public Object rfId;
    //        public Integer mileageIn;
    //        public Integer mileageOut;
    //        public Object color;
    //        public Object licensePlate;
    //        public Object fleetNo;
    //        public String trim;
    //        public String engineDescriptionDisplay;
    //        public String driveType;
    //        public String transmissionControlTypeDisplay;
    //        public String bodyType;
    //        public Object bodyClass;
    //        public Object country;
    //        public String stockId;
    //        public String oem;
    //        public String brand;
    //        public String status;
    //        public Object vehicleType;
    //        public Object inventoryVehicleId;
    //        public Boolean inventoryVehicle;
    //        public Long inServiceDate;
    //        public String baseVehicleId;
    //        public String trimId;
    //        public String engineBaseId;
    //        public String aspirationId;
    //        public String driveTypeId;
    //        public String transmissionControlTypeId;
    //        public String bodyTypeId;
    //        public String fuelTypeId;
    //        public String fuelDeliveryTypeId;
    //        public String bodyNumDoorsId;
    //        public Integer styleId;
    //        public String fuelType;
    //        public String fuelDeliveryType;
    //        public String engineSize;
    //        public String aspiration;
    //        public String transmissionControlType;
    //        public String marketClassCategory;
    //        public String engineCylinders;
    //        public String bodyNumDoors;
    //        public Object afterSalesType;
    //        public Object rank;
    //        public Object chassisNo;
    //        public Object serialNo;
    //        public Integer engineHoursIn;
    //        public Integer engineHoursOut;
    //        public Object type;
    //        public Object location;
    //        public Object locationType;
    //        public Object trimDecodeType;
    //        public Object subType;
    //        @JsonProperty("VIN")
    //        public String vIN;
    //        public String vin;
    //        public Boolean isCustomVehicle;
    //    }
    //    @Id
    //    public String id;
    //    public Object assetNo;
    //    public String serviceId;
    //    public String tenantId;
    //    public String dealerId;
    //    public String siteId;
    //    public String locale;
    //    public Long statusUpdatedTime;
    //    public Object previousStatus;
    //    public String status;
    //    public Object partStatus;
    //    public Object sorStatus;
    //    public Object createdSource;
    //    public String type;
    //    public String customerId;
    //    public String vehicleId;
    //    public Object dealerConfigId;
    //    public Integer jobCount;
    //    public Integer activeJobCount;
    //    public Integer voidedJobCount;
    //    public Integer declinedJobCount;
    //    public Integer holdJobCount;
    //    public Object serviceAdvisorId;
    //    public String teamId;
    //    public Object customerComments;
    //    public Object customerCommentMetaData;
    //    public String externalSource;
    //    public Boolean migrated;
    //    public Object externalNo;
    //    public Object createdByUserId;
    //    public Long createdTime;
    //    public Long modifiedTime;
    //    public Long systemModifiedTime;
    //    public String lastUpdatedByUserId;
    //    public Object coupons;
    //    public Object jobSummaries;
    //    public String dealerConfigDetailId;
    //    public DealerConfigDetail dealerConfigDetail;
    //    public TaxConfigDetails taxConfigDetails;
    //    public Object externalId;
    //    public Object estimateId;
    //    public Object estimateNo;
    //    public Object dealerShipCode;
    //    public Object location;
    //    public String userId;
    //    public Long userModifiedTime;
    //    public Long createdDateTime;
    //    public Long universalModifiedTime;
    //    public Object closedTime;
    //    public Object handOverTime;
    //    public Object closedBy;
    //    public Boolean deleted;
    //    public String roNo;
    //    public Boolean customRoNoUsed;
    //    public String tagNo;
    //    public String source;
    //    public String subType;
    //    public Object customerGroupId;
    //    public String checkinMedium;
    //    public String flagId;
    //    public Long roFlagLastUpdatedTime;
    //    public String stockId;
    //    public String serviceVehicleId;
    //    public String inventoryVehicleId;
    //    public String vehicleType;
    //    public String primaryAdvisorId;
    //    public ArrayList<String> allAdvisorIds;
    //    public ArrayList<String> jobServiceAdvisorIds;
    //    public Long promiseTime;
    //    public Object computedPromiseTime;
    //    public Boolean promiseTimeLocked;
    //    public Long checkinTime;
    //    public String recommendationApprovalStatus;
    //    public String jobWorkStatus;
    //    public Object roLevelSorStatus;
    //    public Boolean invoicedOnce;
    //    public String transportType;
    //    public String transportationId;
    //    public Object appointmentId;
    //    public Object appointmentNo;
    //    public Object appointmentDateTime;
    //    public Object quoteId;
    //    public Object quoteNo;
    //    public Estimate estimate;
    //    public Boolean comeback;
    //    public Object parentRoId;
    //    public Integer nonVoidedJobCount;
    //    public Integer recommendationCount;
    //    public Integer nonVoidedRecommendationCount;
    //    public Integer warrantyClaimCount;
    //    public Boolean hold;
    //    public AdditionalDetail additionalDetail;
    //    public Object inspection;
    //    public Object damages;
    //    public Object reopenReason;
    //    public Object reopenedBy;
    //    public Object reopenedTime;
    //    public Object voidReason;
    //    public Object voidedBy;
    //    public Object voidedTime;
    //    public Object declinedBy;
    //    public Object declinedReason;
    //    public Object declinedTime;
    //    public Object holdReason;
    //    public Object holdReasonCode;
    //    public Object holdBy;
    //    public Object holdTime;
    //    public Object unHoldBy;
    //    public Object unHoldTime;
    //    public ArrayList<String> jobStatuses;
    //    public ArrayList<Object> recommendationStatuses;
    //    public ArrayList<Object> holdTypes;
    //    public Object searchDetail;
    //    public Object invoice;
    //    public Object invoiceV2;
    //    public Object paySplitTotals;
    //    public PaySplitTotalsV3 paySplitTotalsV3;
    //    public Object migratedRoTotals;
    //    public Integer totalBillingTimeInSeconds;
    //    public ArrayList<Object> assignedTechIds;
    //    public ArrayList<Object> assignedTechDetails;
    //    public ArrayList<String> tags;
    //    public ArrayList<TagDetail> tagDetails;
    //    public String mediaLink;
    //    public Object keyLoungeDetails;
    //    public Boolean noDamageInspectionPerformed;
    //    public TotalPrepaidAmount totalPrepaidAmount;
    //    public Object warrantyClaimNumbers;
    //    public Object migrationExtra;
    //    public String departmentId;
    //    public String cpStatus;
    //    public String ipStatus;
    //    public String wpStatus;
    //    public Integer version;
    //    public Integer calculcationVersion;
    //    public ArrayList<Fee> fees;
    //    public ArrayList<Object> applicableVehicleGroupIds;
    //    public Integer priority;
    //    public Integer calculatedPriority;
    //    public Boolean priorityOverridden;
    //    public Object firstClosedTime;
    //    public Object firstClosedBy;
    //    public Object roCloseData;
    //    public Boolean roClosedForFirstTime;
    //    public String cashieringStatus;
    //    public Object listViewFieldsLastModifiedTime;
    //    public Object deferRecallDetails;
    //    public Object oemRewardDetail;
    //    public ArrayList<Object> labelDetails;
    //    public Object drpIcLink;
    //    public Object paymentLinkDetails;
    //    public ArrayList<String> dynamicTags;
    //    public RoActivityTechWorkInfo roActivityTechWorkInfo;
    //    public String viewMode;
    //    public String serviceMode;
    //    public Object obdCheckinId;
    //    public Object externalIntegrationInfos;
    //    public Object migratedEntityId;
    //    public Boolean preRO;
    //    public Boolean activeJobClockInPresent;
    //    public Object userPhone;
}
