package com.tr.urule.abrp.entity;

import com.bstek.urule.model.Label;

/**
 * @author rtao
 * @date 2022/2/7 15:49
 */
public class FinancialStatement {

    @Label("资产负债率")
    private Double assetLiabilityRate;
    @Label("资产负债率得分")
    private Double assetLiabilityRateScore;

    @Label("流动比率")
    private Double liquidityRate;
    @Label("流动比率得分")
    private Double liquidityRateScore;

    @Label("速动比率")
    private Double quickRate;
    @Label("速动比率得分")
    private Double quickRateScore;

    @Label("主营业务收入增长率")
    private Double mainBusinessIncomeGrowthRate;
    @Label("主营业务收入增长率得分")
    private Double mainBusinessIncomeGrowthRateScore;

    @Label("应收帐款周转速度")
    private Double receivableTurnoverRate;
    @Label("应收帐款周转速度得分")
    private Double receivableTurnoverRateScore;

    @Label("存货周转速度")
    private Double inventoryTurnoverRate;
    @Label("存货周转速度得分")
    private Double inventoryTurnoverRateScore;

    @Label("总资产周转速度")
    private Double totalAssetsTurnoverRate;
    @Label("总资产周转速度得分")
    private Double totalAssetsTurnoverRateScore;

    @Label("毛利率")
    private Double grossProfitRate;
    @Label("毛利率得分")
    private Double grossProfitRateScore;

    @Label("营业利润率")
    private Double operatingProfitRatio;
    @Label("营业利润率得分")
    private Double operatingProfitRatioScore;

    @Label("净资产收益率")
    private Double netAssetsIncomeRate;
    @Label("净资产收益率得分")
    private Double netAssetsIncomeRateScore;

    @Label("净利润增长率")
    private Double netProfitGrowthRate;
    @Label("净利润增长率得分")
    private Double netProfitGrowthRateScore;

    @Label("合计（总得分）")
    private Double totalScore;

    public Double getAssetLiabilityRate() {
        return assetLiabilityRate;
    }

    public void setAssetLiabilityRate(Double assetLiabilityRate) {
        this.assetLiabilityRate = assetLiabilityRate;
    }

    public Double getAssetLiabilityRateScore() {
        return assetLiabilityRateScore;
    }

    public void setAssetLiabilityRateScore(Double assetLiabilityRateScore) {
        this.assetLiabilityRateScore = assetLiabilityRateScore;
    }

    public Double getLiquidityRate() {
        return liquidityRate;
    }

    public void setLiquidityRate(Double liquidityRate) {
        this.liquidityRate = liquidityRate;
    }

    public Double getLiquidityRateScore() {
        return liquidityRateScore;
    }

    public void setLiquidityRateScore(Double liquidityRateScore) {
        this.liquidityRateScore = liquidityRateScore;
    }

    public Double getQuickRate() {
        return quickRate;
    }

    public void setQuickRate(Double quickRate) {
        this.quickRate = quickRate;
    }

    public Double getQuickRateScore() {
        return quickRateScore;
    }

    public void setQuickRateScore(Double quickRateScore) {
        this.quickRateScore = quickRateScore;
    }

    public Double getMainBusinessIncomeGrowthRate() {
        return mainBusinessIncomeGrowthRate;
    }

    public void setMainBusinessIncomeGrowthRate(Double mainBusinessIncomeGrowthRate) {
        this.mainBusinessIncomeGrowthRate = mainBusinessIncomeGrowthRate;
    }

    public Double getMainBusinessIncomeGrowthRateScore() {
        return mainBusinessIncomeGrowthRateScore;
    }

    public void setMainBusinessIncomeGrowthRateScore(Double mainBusinessIncomeGrowthRateScore) {
        this.mainBusinessIncomeGrowthRateScore = mainBusinessIncomeGrowthRateScore;
    }

    public Double getReceivableTurnoverRate() {
        return receivableTurnoverRate;
    }

    public void setReceivableTurnoverRate(Double receivableTurnoverRate) {
        this.receivableTurnoverRate = receivableTurnoverRate;
    }

    public Double getReceivableTurnoverRateScore() {
        return receivableTurnoverRateScore;
    }

    public void setReceivableTurnoverRateScore(Double receivableTurnoverRateScore) {
        this.receivableTurnoverRateScore = receivableTurnoverRateScore;
    }

    public Double getInventoryTurnoverRate() {
        return inventoryTurnoverRate;
    }

    public void setInventoryTurnoverRate(Double inventoryTurnoverRate) {
        this.inventoryTurnoverRate = inventoryTurnoverRate;
    }

    public Double getInventoryTurnoverRateScore() {
        return inventoryTurnoverRateScore;
    }

    public void setInventoryTurnoverRateScore(Double inventoryTurnoverRateScore) {
        this.inventoryTurnoverRateScore = inventoryTurnoverRateScore;
    }

    public Double getTotalAssetsTurnoverRate() {
        return totalAssetsTurnoverRate;
    }

    public void setTotalAssetsTurnoverRate(Double totalAssetsTurnoverRate) {
        this.totalAssetsTurnoverRate = totalAssetsTurnoverRate;
    }

    public Double getTotalAssetsTurnoverRateScore() {
        return totalAssetsTurnoverRateScore;
    }

    public void setTotalAssetsTurnoverRateScore(Double totalAssetsTurnoverRateScore) {
        this.totalAssetsTurnoverRateScore = totalAssetsTurnoverRateScore;
    }

    public Double getGrossProfitRate() {
        return grossProfitRate;
    }

    public void setGrossProfitRate(Double grossProfitRate) {
        this.grossProfitRate = grossProfitRate;
    }

    public Double getGrossProfitRateScore() {
        return grossProfitRateScore;
    }

    public void setGrossProfitRateScore(Double grossProfitRateScore) {
        this.grossProfitRateScore = grossProfitRateScore;
    }

    public Double getOperatingProfitRatio() {
        return operatingProfitRatio;
    }

    public void setOperatingProfitRatio(Double operatingProfitRatio) {
        this.operatingProfitRatio = operatingProfitRatio;
    }

    public Double getOperatingProfitRatioScore() {
        return operatingProfitRatioScore;
    }

    public void setOperatingProfitRatioScore(Double operatingProfitRatioScore) {
        this.operatingProfitRatioScore = operatingProfitRatioScore;
    }

    public Double getNetAssetsIncomeRate() {
        return netAssetsIncomeRate;
    }

    public void setNetAssetsIncomeRate(Double netAssetsIncomeRate) {
        this.netAssetsIncomeRate = netAssetsIncomeRate;
    }

    public Double getNetAssetsIncomeRateScore() {
        return netAssetsIncomeRateScore;
    }

    public void setNetAssetsIncomeRateScore(Double netAssetsIncomeRateScore) {
        this.netAssetsIncomeRateScore = netAssetsIncomeRateScore;
    }

    public Double getNetProfitGrowthRate() {
        return netProfitGrowthRate;
    }

    public void setNetProfitGrowthRate(Double netProfitGrowthRate) {
        this.netProfitGrowthRate = netProfitGrowthRate;
    }

    public Double getNetProfitGrowthRateScore() {
        return netProfitGrowthRateScore;
    }

    public void setNetProfitGrowthRateScore(Double netProfitGrowthRateScore) {
        this.netProfitGrowthRateScore = netProfitGrowthRateScore;
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

}
