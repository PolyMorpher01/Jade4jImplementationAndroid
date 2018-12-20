package com.example.leapfrog.jadetest2;

public class DocumentAob {

  private boolean isWebSiteChecked;
  private boolean isEmailChecked;
  private boolean isHardCopyChecked;
  private String customerSignature;
  private String relationship;
  private String date;
  private String backgroundImage;

  public DocumentAob(boolean isWebSiteChecked, boolean isEmailChecked, boolean isHardCopyChecked,
      String customerSignature, String backgroundImage, String relationship, String date) {
    this.isWebSiteChecked = isWebSiteChecked;
    this.isEmailChecked = isEmailChecked;
    this.isHardCopyChecked = isHardCopyChecked;
    this.customerSignature = customerSignature;
    this.backgroundImage = backgroundImage;
    this.relationship = relationship;
    this.date = date;
  }

  public boolean isWebSiteChecked() {
    return isWebSiteChecked;
  }

  public boolean isEmailChecked() {
    return isEmailChecked;
  }

  public boolean isHardCopyChecked() {
    return isHardCopyChecked;
  }

  public String getCustomerSignature() {
    return customerSignature;
  }

  public String getRelationship() {
    return relationship;
  }

  public String getDate() {
    return date;
  }

  public String getBackgroundImage() {
    return backgroundImage;
  }
}
