/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Stock extends ShareAsset {
    private double totalShares;

    public Stock(String symbol, double totalCost, double currentPrice, double totalShares) {
        super(symbol, totalCost, currentPrice);
        this.totalShares = totalShares;
    }

    @Override
    public double getMarketValue() {
        return this.totalShares*this.currentPrice;
    }
    
    @Override
    public double getProfit(){
        return (this.totalShares*this.currentPrice)-this.totalCost;
    }
}
