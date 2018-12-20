package com.example.leapfrog.jadetest2;

public class DocumentAob {

  private boolean webSiteChecked;
  private boolean emailChecked;
  private boolean hardCopyChecked;
  private String customerSignature;
  private String relationship;
  private String date;
  private String backgroundImage;

  public DocumentAob(boolean webSiteChecked, boolean emailChecked, boolean hardCopyChecked,
      String customerSignature, String backgroundImage, String relationship, String date) {
    this.webSiteChecked = webSiteChecked;
    this.emailChecked = emailChecked;
    this.hardCopyChecked = hardCopyChecked;
    this.customerSignature = customerSignature;
    this.backgroundImage = backgroundImage;
    this.relationship = relationship;
    this.date = date;
  }

  public boolean getWebSiteChecked() {
    return webSiteChecked;
  }

  public boolean getEmailChecked() {
    return emailChecked;
  }

  public boolean getHardCopyChecked() {
    return hardCopyChecked;
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
