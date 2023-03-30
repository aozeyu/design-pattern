package org.example.factory;

public class GetPlanFactory {
  public Plan getPlan(String planType) {
    if (planType == null) {
      return null;
    }
    if (planType.equalsIgnoreCase("DOMESTICPLAN")) {

      return new DomesticPlan();
    } else if (planType.equalsIgnoreCase("COMMERRCIAL")) {
      return new CommercialPlan();
    } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {

      return new InstitutionalPlan();
    }
    return null;
  }
}
