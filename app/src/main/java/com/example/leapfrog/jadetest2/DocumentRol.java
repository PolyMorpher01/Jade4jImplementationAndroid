package com.example.leapfrog.jadetest2;

public class DocumentRol {
  private String lineItemName;
  private String purchaseDate;
  private String backgroundImage;
  private String customerSignatureImage;
  private String schSignatureImage;

  public DocumentRol(String lineItemName, String purchaseDate, String backgroundImage,
      String customerSignatureImage, String schSignatureImage) {
    this.lineItemName = lineItemName;
    this.purchaseDate = purchaseDate;
    this.backgroundImage = backgroundImage;
    this.customerSignatureImage = customerSignatureImage;
    this.schSignatureImage = schSignatureImage;
  }

  public String getBackgroundImage() {
    return backgroundImage;
  }

  public String getCustomerSignatureImage() {
    return customerSignatureImage;
  }

  public String getSchSignatureImage() {
    return schSignatureImage;
  }

  public String getLineItemName() {
    return lineItemName;
  }

  public String getPurchaseDate() {
    return purchaseDate;
  }
}
