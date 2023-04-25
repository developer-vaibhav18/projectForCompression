package com.example.beans.redis;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("RepairOrder")
public class RedisRepairOrder {
    public class AdditionalDetail{
        public CustomerInfo customerInfo;
        public DropOffCustomerInfo dropOffCustomerInfo;
        public BillingContactCustomerInfo billingContactCustomerInfo;
        public String label;
        public VehicleInfo vehicleInfo;
    }

    public class Address{
        public String id;
        public String line1;
        public String line2;
        public String postalCode;
        public String city;
        public String state;
        public String country;
        public Object residentType;
        public Object monthlyRentOrMortgageAmount;
        public String county;
        public Object periodOfResidence;
        public Object mortageValue;
        public Object routeNumber;
        public int addressType;
        public int startDate;
        public int endDate;
        @JsonProperty("default")
        public boolean mydefault;
        public Object currentAddress;
    }

    public class Address2{
        public String id;
        public String line1;
        public String line2;
        public String postalCode;
        public String city;
        public String state;
        public String country;
        public Object residentType;
        public Object monthlyRentOrMortgageAmount;
        public String county;
        public Object periodOfResidence;
        public Object mortageValue;
        public Object routeNumber;
        public int addressType;
        public int startDate;
        public int endDate;
        @JsonProperty("default")
        public boolean mydefault;
        public Object currentAddress;
    }

    public class Amount{
        public int amount;
        public String currency;
    }

    public class BigDecimalTax{
        public Object laborOnlyTaxHighPrecision;
        public Object partOnlyTaxHighPrecision;
        public Object serviceFeeTaxHighPrecision;
        public Object partFeeTaxHighPrecision;
        public Object feeTaxHighPrecision;
        public Object partTaxHighPrecision;
        public Object serviceTaxHighPrecision;
        public Object deductibleTaxHighPrecision;
        public Object thirdPartyTaxHighPrecision;
        public Object flatSplitTaxHighPrecision;
        public Object subletTaxHighPrecision;
        public Object subletLaborTaxHighPrecision;
        public Object subletPartTaxHighPrecision;
        public Object residueTaxHighPrecision;
        public Object totalNonSplitItemsTaxHighPrecision;
    }

    public class BillingContactCustomerInfo{
        public String id;
        public Object externalId;
        public String firstName;
        public String lastName;
        public String preferredLanguage;
        public String companyName;
        public String email;
        public Object note;
        public Object customerCommentMetaData;
        public String customerNumber;
        public boolean taxExempted;
        public Object reasonForTaxExemption;
        public Object taxExemptNumber;
        public String customerType;
        public int customerTypeInteger;
        public String customerDetailType;
        public String primaryPhone;
        public ArrayList<Address> addresses;
        public Address address;
        public ArrayList<Phone> phones;
        public String preferredCommunicationMode;
        public int preferredContactType;
        public boolean optInText;
        public boolean optInEmail;
        public Object originalCustomerInfo;
        public Object customerTaxOverride;
        public boolean deleted;
        public Object deleteReason;
        public int deleteTimestamp;
    }

    public class CostPricingDetail{
        public String pricingType;
        public int flatPrice;
        public Object basePrice;
        public Object percentage;
        public Object minAmount;
        public Object maxAmount;
    }

    public class CpAmounts{
        public int closedTime;
        public Object closedBy;
        public int amount;
        public int estimateAmount;
        public int laborAmount;
        public int partsAmount;
        public int partCoreAmount;
        public int partCoreReturnAmount;
        public int laborCostAmount;
        public int partCostAmount;
        public int adjustedPartCostAmount;
        public int adjustedLaborCostAmount;
        public int initialLaborCostAmount;
        public int serviceTotalAmount;
        public int partsTotalAmount;
        public int serviceFeeAmount;
        public int serviceFeeCostAmount;
        public int partFeeAmount;
        public int partFeeCostAmount;
        public int serviceCouponsAmount;
        public int partCouponsAmount;
        public int deductibleAmount;
        public int serviceTax;
        public int serviceFeeTax;
        public int partTax;
        public int partFeeTax;
        public int subletTax;
        public int deductibleTax;
        public int thirdPartyTax;
        public int subletLaborTax;
        public int subletPartTax;
        public int flatSplitAmount;
        public int flatSplitAmountTax;
        public int subletSaleAmount;
        public int subletLaborSaleAmount;
        public int subletPartSaleAmount;
        public int subletCostAmount;
        public int subletLaborCostAmount;
        public int subletPartCostAmount;
        public int serviceCouponsAmountForGrossCalculation;
        public int partCouponsAmountForGrossCalculation;
        public int roCouponsAmount;
        public int roCouponTax;
        public int roFeeAmount;
        public int roFeeCostAmount;
        public int roFeeTax;
        public int roFeeTaxableAmount;
        public ArrayList<Object> paySplitShares;
        public int totalBillingTimeInSeconds;
        public int totalDiscount;
        public int residueTax;
        public int totalNonSplitItemsTax;
        public int preTaxTotalWithoutCoupons;
        public int preTaxCostTotalWithoutCoupons;
        public int totalFees;
        public int preTaxTotal;
        public int postTaxTotal;
        public int totalTax;
    }

    public class CustomerInfo{
        public String id;
        public Object externalId;
        public String firstName;
        public String lastName;
        public String preferredLanguage;
        public String companyName;
        public String email;
        public Object note;
        public Object customerCommentMetaData;
        public String customerNumber;
        public boolean taxExempted;
        public Object reasonForTaxExemption;
        public Object taxExemptNumber;
        public String customerType;
        public int customerTypeInteger;
        public String customerDetailType;
        public String primaryPhone;
        public ArrayList<Address> addresses;
        public Address address;
        public ArrayList<Phone> phones;
        public String preferredCommunicationMode;
        public int preferredContactType;
        public boolean optInText;
        public boolean optInEmail;
        public Object originalCustomerInfo;
        public Object customerTaxOverride;
        public boolean deleted;
        public Object deleteReason;
        public int deleteTimestamp;
    }

    public class DealerConfigDetail{
        public String id;
        public TaxConfigDetails taxConfigDetails;
        public String roundingMode;
        public String dealerId;
        public String tenantId;
        public String siteId;
        public long createdTime;
    }

    public class DropOffCustomerInfo{
        public String id;
        public Object externalId;
        public String firstName;
        public String lastName;
        public String preferredLanguage;
        public String companyName;
        public String email;
        public Object note;
        public Object customerCommentMetaData;
        public String customerNumber;
        public boolean taxExempted;
        public Object reasonForTaxExemption;
        public Object taxExemptNumber;
        public String customerType;
        public int customerTypeInteger;
        public String customerDetailType;
        public String primaryPhone;
        public ArrayList<Address> addresses;
        public Address address;
        public ArrayList<Phone> phones;
        public String preferredCommunicationMode;
        public int preferredContactType;
        public boolean optInText;
        public boolean optInEmail;
        public Object originalCustomerInfo;
        public Object customerTaxOverride;
        public boolean deleted;
        public Object deleteReason;
        public int deleteTimestamp;
    }

    public class Estimate{
        public int revisionNumber;
        public int pdfVersion;
        public long revisedTime;
        public Object comment;
        public ArrayList<String> jobIds;
        public String revisedBy;
        public Object approvalDetails;
        public Object customerPay;
        public Object internalPay;
        public Object warrantyPay;
    }

    public class Fee{
        public String id;
        public String feeId;
        public String feeCode;
        public String description;
        public Amount amount;
        public ArrayList<String> overrideFlags;
        public SalePricingDetail salePricingDetail;
        public CostPricingDetail costPricingDetail;
        public Object overriddenSaleAmount;
        public Object overriddenCostAmount;
        public ArrayList<Object> excludeOpcodes;
        public ArrayList<Object> excludeServiceTypeIds;
        public String costCenterSplitType;
        public Object costCenters;
        public boolean costCentreOverridden;
        public Object linkedOperationId;
        public ArrayList<TaxConfig> taxConfigs;
        public String pricingType;
        public double flatPrice;
        public int percentage;
        public boolean minMaxLimits;
        public double minAmount;
        public double maxAmount;
        public boolean overridden;
        public Object criteria;
        public String pricingMethod;
        public Object gridConfigId;
        public String code;
        public String type;
    }

    public class FeeCalculationResult{
        public String id;
        public String feeId;
        public String feeCode;
        public String levelId;
        public String levelType;
        public int feeAmount;
        public int feeCostAmount;
        public boolean taxable;
        public ArrayList<TaxConfig> taxConfigs;
        public String payType;
        public String type;
    }

    public class PaySplitTotalsV3{
        public CpAmounts cpAmounts;
        public ArrayList<Object> insurances;
        public Object ipAmounts;
        public Object wpAmounts;
        public int totalInsuranceAmount;
        public int totalDeductible;
        public int cpAmountFromWarrantySplit;
        public int cpTaxFromWarrantySplit;
        public int cpAmountFromInternalSplit;
        public int cpTaxFromInternalSplit;
        public ArrayList<Object> couponsResult;
        public ArrayList<FeeCalculationResult> feeCalculationResults;
        public ArrayList<TaxCalculationResult> taxCalculationResults;
        public ArrayList<TaxCodeTaxAmount> taxCodeTaxAmounts;
        public int insurancePayableAmount;
        public int insuranceApprovedAmount;
        public int totalLaborAmount;
        public int totalBillingTimeInSeconds;
        public int totalCpAmount;
        public int totalWpAmount;
        public int totalIpAmount;
        public int totalAmount;
    }

    public class Phone{
        public int phoneType;
        public String number;
        public Object countryCode;
        public Object extension;
        public boolean isPrimary;
        public boolean optOutOfMarketingCalls;
    }



    public class RoActivityTechWorkInfo{
        public String roTechWorkStatus;
        public long lastActivityTechTime;
    }

    public class Root{
        public RedisRepairOrder repairOrder;
    }

    public class SalePricingDetail{
        public String pricingType;
        public int flatPrice;
        public Object basePrice;
        public int percentage;
        public Object minAmount;
        public Object maxAmount;
    }

    public class TagDetail{
        public String tag;
        public String tagType;
        public String tagAdditionType;
        public String tagKeyWord;
        public Object addedTime;
        public String addedByUserId;
    }

    public class TaxableAmounts{
        public int nonTaxableLaborAmount;
        public int taxableLaborAmount;
        public int nonTaxablePartsAmount;
        public int taxablePartsAmount;
        public int nonTaxableSubletSaleAmount;
        public int taxableSubletSaleAmount;
        public int nonTaxableSubletLaborSaleAmount;
        public int taxableSubletLaborSaleAmount;
        public int nonTaxableSubletPartSaleAmount;
        public int taxableSubletPartSaleAmount;
        public int nonTaxableServiceFeeAmount;
        public int taxableServiceFeeAmount;
        public int nonTaxablePartFeeAmount;
        public int taxablePartFeeAmount;
        public int taxableDeductibleAmount;
        public int nonTaxableDeductibleAmount;
        public int taxableThirdPartyAmount;
        public int nonTaxableThirdPartyAmount;
        public int taxableFlatSplitAmount;
        public int nonTaxableFlatSplitAmount;
        public int nonTaxableServiceCouponsAmount;
        public int nonTaxablePartCouponsAmount;
        public String levelId;
        public String taxLevel;
        public String taxType;
        public Object taxPercentage;
        public Object preTaxSplit;
        public String payType;
        public Object taxCode;
        public boolean laborTaxable;
        public boolean partsTaxable;
        public boolean subletLaborTaxable;
        public boolean subletPartTaxable;
        public boolean subletTaxable;
        public boolean saleTaxableForSplitJob;
        public boolean coreTaxable;
        public boolean coreReturnTaxable;
        public int totalTaxableAmount;
        public int totalNonTaxableAmount;
    }

    public class TaxCalculationResult{
        public TaxableAmounts taxableAmounts;
        public int laborOnlyTax;
        public int partOnlyTax;
        public int serviceFeeTax;
        public int partFeeTax;
        public int feeTax;
        public int partTax;
        public int serviceTax;
        public int deductibleTax;
        public int thirdPartyTax;
        public int flatSplitTax;
        public int subletTax;
        public int subletLaborTax;
        public int subletPartTax;
        public int residueTax;
        public int totalNonSplitItemsTax;
        public int totalComputedTax;
        public int customerPayableTax;
        public String taxLevel;
        public String levelId;
        public String taxType;
        public String payType;
        public BigDecimalTax bigDecimalTax;
        public TotalCustomerPayableTax totalCustomerPayableTax;
        public TotalTax totalTax;
    }

    public class TaxCodeTaxAmount{
        public String levelId;
        public String levelType;
        public String taxCode;
        public String taxCodeType;
        public String payType;
        public Object harmonized;
        public String taxCategory;
        public int laborAmount;
        public int feeAmount;
        public int subletLaborAmount;
        public int subletPartAmount;
        public int partAmount;
        public int partFeeAmount;
        public int deductibleAmount;
        public int thirdPartyAmount;
        public int flatSplitAmount;
        public int totalAmount;
        public int nonSplitAmount;
        public int nonTaxableServiceCouponsAmount;
        public int nonTaxablePartCouponsAmount;
        public int laborTax;
        public int feeTax;
        public int subletLaborTax;
        public int subletPartTax;
        public int partTax;
        public int partFeeTax;
        public int deductibleTax;
        public int thirdPartyTax;
        public int flatSplitAmountTax;
        public int nonSplitAmountTax;
        public int totalTax;
        public Object subCodeAmounts;
        public Object preTaxSplit;
    }

    public class TaxConfig{
        public String payType;
        public String taxRegimeType;
        public boolean taxable;
    }

    public class TaxConfigDetails{
        public ArrayList<TaxLabelConfig> taxLabelConfigs;
        public boolean unifyTaxes;
    }

    public class TaxLabelConfig{
        public String label;
        public String type;
        public int percentage;
    }

    public class TotalCustomerPayableTax{
        public int amount;
        public String currency;
    }

    public class TotalPrepaidAmount{
        public int amount;
        public String currency;
    }

    public class TotalTax{
        public int amount;
        public String currency;
    }

    public class VehicleInfo{
        public String id;
        public String year;
        public String make;
        public String makeId;
        public String makeLabel;
        public String model;
        public Object displayModel;
        public Object rfId;
        public int mileageIn;
        public int mileageOut;
        public Object color;
        public Object licensePlate;
        public Object fleetNo;
        public String trim;
        public String engineDescriptionDisplay;
        public String driveType;
        public String transmissionControlTypeDisplay;
        public String bodyType;
        public Object bodyClass;
        public Object country;
        public String stockId;
        public String oem;
        public String brand;
        public String status;
        public Object vehicleType;
        public Object inventoryVehicleId;
        public boolean inventoryVehicle;
        public long inServiceDate;
        public String baseVehicleId;
        public String trimId;
        public String engineBaseId;
        public String aspirationId;
        public String driveTypeId;
        public String transmissionControlTypeId;
        public String bodyTypeId;
        public String fuelTypeId;
        public String fuelDeliveryTypeId;
        public String bodyNumDoorsId;
        public int styleId;
        public String fuelType;
        public String fuelDeliveryType;
        public String engineSize;
        public String aspiration;
        public String transmissionControlType;
        public String marketClassCategory;
        public String engineCylinders;
        public String bodyNumDoors;
        public Object afterSalesType;
        public Object rank;
        public Object chassisNo;
        public Object serialNo;
        public int engineHoursIn;
        public int engineHoursOut;
        public Object type;
        public Object location;
        public Object locationType;
        public Object trimDecodeType;
        public Object subType;
        @JsonProperty("VIN")
        public String vIN;
        public String vin;
        public boolean isCustomVehicle;
    }

    public String id;
    public Object assetNo;
    public String serviceId;
    public String tenantId;
    public String dealerId;
    public String siteId;
    public String locale;
    public long statusUpdatedTime;
    public Object previousStatus;
    public String status;
    public Object partStatus;
    public Object sorStatus;
    public Object createdSource;
    public String type;
    public String customerId;
    public String vehicleId;
    public Object dealerConfigId;
    public int jobCount;
    public int activeJobCount;
    public int voidedJobCount;
    public int declinedJobCount;
    public int holdJobCount;
    public Object serviceAdvisorId;
    public String teamId;
    public Object customerComments;
    public Object customerCommentMetaData;
    public String externalSource;
    public boolean migrated;
    public Object externalNo;
    public Object createdByUserId;
    public long createdTime;
    public long modifiedTime;
    public long systemModifiedTime;
    public String lastUpdatedByUserId;
    public Object coupons;
    public Object jobSummaries;
    public String dealerConfigDetailId;
    public DealerConfigDetail dealerConfigDetail;
    public TaxConfigDetails taxConfigDetails;
    public Object externalId;
    public Object estimateId;
    public Object estimateNo;
    public Object dealerShipCode;
    public Object location;
    public String userId;
    public long userModifiedTime;
    public long createdDateTime;
    public long universalModifiedTime;
    public Object closedTime;
    public Object handOverTime;
    public Object closedBy;
    public boolean deleted;
    public String roNo;
    public boolean customRoNoUsed;
    public String tagNo;
    public String source;
    public String subType;
    public Object customerGroupId;
    public String checkinMedium;
    public String flagId;
    public long roFlagLastUpdatedTime;
    public String stockId;
    public String serviceVehicleId;
    public String inventoryVehicleId;
    public String vehicleType;
    public String primaryAdvisorId;
    public ArrayList<String> allAdvisorIds;
    public ArrayList<String> jobServiceAdvisorIds;
    public long promiseTime;
    public Object computedPromiseTime;
    public boolean promiseTimeLocked;
    public long checkinTime;
    public String recommendationApprovalStatus;
    public String jobWorkStatus;
    public Object roLevelSorStatus;
    public boolean invoicedOnce;
    public String transportType;
    public String transportationId;
    public Object appointmentId;
    public Object appointmentNo;
    public Object appointmentDateTime;
    public Object quoteId;
    public Object quoteNo;
    public Estimate estimate;
    public boolean comeback;
    public Object parentRoId;
    public int nonVoidedJobCount;
    public int recommendationCount;
    public int nonVoidedRecommendationCount;
    public int warrantyClaimCount;
    public boolean hold;
    public AdditionalDetail additionalDetail;
    public Object inspection;
    public Object damages;
    public Object reopenReason;
    public Object reopenedBy;
    public Object reopenedTime;
    public Object voidReason;
    public Object voidedBy;
    public Object voidedTime;
    public Object declinedBy;
    public Object declinedReason;
    public Object declinedTime;
    public Object holdReason;
    public Object holdReasonCode;
    public Object holdBy;
    public Object holdTime;
    public Object unHoldBy;
    public Object unHoldTime;
    public ArrayList<String> jobStatuses;
    public ArrayList<Object> recommendationStatuses;
    public ArrayList<Object> holdTypes;
    public Object searchDetail;
    public Object invoice;
    public Object invoiceV2;
    public Object paySplitTotals;
    public PaySplitTotalsV3 paySplitTotalsV3;
    public Object migratedRoTotals;
    public int totalBillingTimeInSeconds;
    public ArrayList<Object> assignedTechIds;
    public ArrayList<Object> assignedTechDetails;
    public ArrayList<String> tags;
    public ArrayList<TagDetail> tagDetails;
    public String mediaLink;
    public Object keyLoungeDetails;
    public boolean noDamageInspectionPerformed;
    public TotalPrepaidAmount totalPrepaidAmount;
    public Object warrantyClaimNumbers;
    public Object migrationExtra;
    public String departmentId;
    public String cpStatus;
    public String ipStatus;
    public String wpStatus;
    public int version;
    public int calculcationVersion;
    public ArrayList<Fee> fees;
    public ArrayList<Object> applicableVehicleGroupIds;
    public int priority;
    public int calculatedPriority;
    public boolean priorityOverridden;
    public Object firstClosedTime;
    public Object firstClosedBy;
    public Object roCloseData;
    public boolean roClosedForFirstTime;
    public String cashieringStatus;
    public Object listViewFieldsLastModifiedTime;
    public Object deferRecallDetails;
    public Object oemRewardDetail;
    public ArrayList<Object> labelDetails;
    public Object drpIcLink;
    public Object paymentLinkDetails;
    public ArrayList<String> dynamicTags;
    public RoActivityTechWorkInfo roActivityTechWorkInfo;
    public String viewMode;
    public String serviceMode;
    public Object obdCheckinId;
    public Object externalIntegrationInfos;
    public Object migratedEntityId;
    public boolean preRO;
    public boolean activeJobClockInPresent;
    public Object userPhone;
}

