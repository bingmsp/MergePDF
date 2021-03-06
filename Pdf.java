package mergePDF;

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;
  
import java.io.File; 
import java.io.IOException;

public class Pdf {
   public static void main(String[] args) throws IOException {
	   System.out.println("Wait...");
      //Loading an existing PDF document
      File file1 = new File("F:/shared/Bing/neo/1) Cover_page.pdf");
      PDDocument doc1 = PDDocument.load(file1);
       
      File file2 = new File("F:/shared/Bing/neo/2) page1.pdf");
      PDDocument doc2 = PDDocument.load(file2);
      
      File file3 = new File("F:/shared/Bing/neo/3) TableOfContents.pdf");
      PDDocument doc3 = PDDocument.load(file3);
      
      File file4 = new File("F:/shared/Bing/neo/4) Welcome, Introductions & Agenda Review.pdf");
      PDDocument doc4 = PDDocument.load(file4);
      
      File file5 = new File("F:/shared/Bing/neo/5) New Employee Orientation.pdf");
      PDDocument doc5 = PDDocument.load(file5);
      
      File file6 = new File("F:/shared/Bing/neo/6) Our Mission.pdf");
      PDDocument doc6 = PDDocument.load(file6);
      
      File file7 = new File("F:/shared/Bing/neo/7) Our Values.pdf");
      PDDocument doc7 = PDDocument.load(file7);
      
      File file8 = new File("F:/shared/Bing/neo/8) The Commission.pdf");
      PDDocument doc8 = PDDocument.load(file8);
      
      File file9 = new File("F:/shared/Bing/neo/9) The Mac's Jurisdiction.pdf");
      PDDocument doc9 = PDDocument.load(file9);
      
      File file10 = new File("F:/shared/Bing/neo/10) The MAC Organization.pdf");
      PDDocument doc10 = PDDocument.load(file10);
      
      File file11 = new File("F:/shared/Bing/neo/11) The MAC Organization Structure.pdf");
      PDDocument doc11 = PDDocument.load(file11);
      
      File file12 = new File("F:/shared/Bing/neo/12) Activities and Events.pdf");
      PDDocument doc12 = PDDocument.load(file12);
      
      File file13 = new File("F:/shared/Bing/neo/13) Communication.pdf");
      PDDocument doc13 = PDDocument.load(file13);
      
      File file14 = new File("F:/shared/Bing/neo/14) Sustainability.pdf");
      PDDocument doc14 = PDDocument.load(file14);
      
      File file15 = new File("F:/shared/Bing/neo/15) Diversity.pdf");
      PDDocument doc15 = PDDocument.load(file15);
      
      File file16 = new File("F:/shared/Bing/neo/16) Diversity_1.pdf");
      PDDocument doc16 = PDDocument.load(file16);
      
      File file17 = new File("F:/shared/Bing/neo/17) Benefits.pdf");
      PDDocument doc17 = PDDocument.load(file17);
      
      File file18 = new File("F:/shared/Bing/neo/18) Your Health.pdf");
      PDDocument doc18 = PDDocument.load(file18);
      
      File file19 = new File("F:/shared/Bing/neo/19) Your Future.pdf");
      PDDocument doc19 = PDDocument.load(file19);
      
      File file20 = new File("F:/shared/Bing/neo/20) Employee Wellness Program.pdf");
      PDDocument doc20 = PDDocument.load(file20);
      
      File file21 = new File("F:/shared/Bing/neo/21) Other Benefits, Policy, Guidelines & Rules.pdf");
      PDDocument doc21 = PDDocument.load(file21);
      
      File file22 = new File("F:/shared/Bing/neo/22) Your Future_1.pdf");
      PDDocument doc22 = PDDocument.load(file22);
      
      File file23 = new File("F:/shared/Bing/neo/23) Your Other Benefits.pdf");
      PDDocument doc23 = PDDocument.load(file23);
      
      File file24 = new File("F:/shared/Bing/neo/24) Your Other Benefits_1.pdf");
      PDDocument doc24 = PDDocument.load(file24);
      
      File file25 = new File("F:/shared/Bing/neo/25) Policies, Guidelines and Rules.pdf");
      PDDocument doc25 = PDDocument.load(file25);
      
      File file26 = new File("F:/shared/Bing/neo/26) Policies, Guidelines and Rules_1.pdf");
      PDDocument doc26 = PDDocument.load(file26);
      
      File file27 = new File("F:/shared/Bing/neo/27) Policies, Guidelines and Rules_2.pdf");
      PDDocument doc27 = PDDocument.load(file27);
      
      File file28 = new File("F:/shared/Bing/neo/28) Policies, Guidelines and Rules_3.pdf");
      PDDocument doc28 = PDDocument.load(file28);
      
      File file29 = new File("F:/shared/Bing/neo/29) Policies, Guidelines and Rules_4.pdf");
      PDDocument doc29 = PDDocument.load(file29);
      
      File file30 = new File("F:/shared/Bing/neo/30) Policies, Guidelines and Rules_5.pdf");
      PDDocument doc30 = PDDocument.load(file30);
      
      File file31 = new File("F:/shared/Bing/neo/31) Getting Started.pdf");
      PDDocument doc31 = PDDocument.load(file31);
      
      File file32 = new File("F:/shared/Bing/neo/32) Getting Started_1.pdf");
      PDDocument doc32 = PDDocument.load(file32);
      
      File file33 = new File("F:/shared/Bing/neo/33) MAC Intranet.pdf");
      PDDocument doc33 = PDDocument.load(file33);
      
      File file34 = new File("F:/shared/Bing/neo/34) Websites.pdf");
      PDDocument doc34 = PDDocument.load(file34);
      
      File file35 = new File("F:/shared/Bing/neo/35) Phone Roster - Administrative Office.pdf");
      PDDocument doc35 = PDDocument.load(file35);
      
      File file36 = new File("F:/shared/Bing/neo/36) Phone Roster - Administration.pdf");
      PDDocument doc36 = PDDocument.load(file36);
      
      File file37 = new File("F:/shared/Bing/neo/37) Phone Roster - Terminals 1, 2, Trades & Maint.pdf");
      PDDocument doc37 = PDDocument.load(file37);
      
      File file38 = new File("F:/shared/Bing/neo/38) Phone Roster - Terminals 1 & 2, Trades & Maintenance_1.pdf");
      PDDocument doc38 = PDDocument.load(file38);
      
      File file39 = new File("F:/shared/Bing/neo/39) OrientationChecklistForManagers.pdf");
      PDDocument doc39 = PDDocument.load(file39);
      
      File file40 = new File("F:/shared/Bing/neo/40) EmployeeParkingPolicy.pdf");
      PDDocument doc40 = PDDocument.load(file40);
      
      File file41 = new File("F:/shared/Bing/neo/41) CodeOfEthicsPolicy.pdf");
      PDDocument doc41 = PDDocument.load(file41);
      
      File file42 = new File("F:/shared/Bing/neo/42) CodeOfEthicsPolicy-2.pdf");
      PDDocument doc42 = PDDocument.load(file42);
      
      File file43 = new File("F:/shared/Bing/neo/43) WorkPlaceViolence.pdf");
      PDDocument doc43 = PDDocument.load(file43);
      
      File file44 = new File("F:/shared/Bing/neo/44) WorkPlaceViolence-2.pdf");
      PDDocument doc44 = PDDocument.load(file44);
      
      File file45 = new File("F:/shared/Bing/neo/45) AffirmativeActionPlan.pdf");
      PDDocument doc45 = PDDocument.load(file45);
      
      File file46 = new File("F:/shared/Bing/neo/46) AffirmativeActionPlan-2.pdf");
      PDDocument doc46 = PDDocument.load(file46);
      
      File file47 = new File("F:/shared/Bing/neo/47) Forms.pdf");
      PDDocument doc47 = PDDocument.load(file47);
      
      File file48 = new File("F:/shared/Bing/neo/48) Vacation Advance Auth.pdf");
      PDDocument doc48 = PDDocument.load(file48);
      
      File file49 = new File("F:/shared/Bing/neo/49) Acceptable Use Statement.pdf");
      PDDocument doc49 = PDDocument.load(file49);
      
      File file50 = new File("F:/shared/Bing/neo/50) Policy Acknowledgment.pdf");
      PDDocument doc50 = PDDocument.load(file50);
      
      File file51 = new File("F:/shared/Bing/neo/51) Acronyms and Definitions.pdf");
      PDDocument doc51 = PDDocument.load(file51);
      
      File file52 = new File("F:/shared/Bing/neo/52) Acronyms and Definitions_1.pdf");
      PDDocument doc52 = PDDocument.load(file52);
      
      File file53 = new File("F:/shared/Bing/neo/53) Acronyms and Definitions_2.pdf");
      PDDocument doc53 = PDDocument.load(file53);
      
      File file54 = new File("F:/shared/Bing/neo/54) Acronyms and Definitions_3.pdf");
      PDDocument doc54 = PDDocument.load(file54);
      
      
      //Instantiating PDFMergerUtility class
      PDFMergerUtility PDFmerger = new PDFMergerUtility();

      //Setting the destination file
//      PDFmerger.setDestinationFileName("C:/Users/Stephen.Kim/stufftesting/merged.pdf");
      PDFmerger.setDestinationFileName("F:/shared/Bing/neo/merged/merged.pdf");

      
      //adding the source files
      PDFmerger.addSource(file1);
      PDFmerger.addSource(file2);
      PDFmerger.addSource(file3);
      PDFmerger.addSource(file4);
      PDFmerger.addSource(file5);
      PDFmerger.addSource(file6);
      PDFmerger.addSource(file7);
      PDFmerger.addSource(file8);
      PDFmerger.addSource(file9);
      PDFmerger.addSource(file10);
      PDFmerger.addSource(file11);
      PDFmerger.addSource(file12);
      PDFmerger.addSource(file13);
      PDFmerger.addSource(file14);
      PDFmerger.addSource(file15);
      PDFmerger.addSource(file16);
      PDFmerger.addSource(file17);
      PDFmerger.addSource(file18);
      PDFmerger.addSource(file19);
      PDFmerger.addSource(file20);
      PDFmerger.addSource(file21);
      PDFmerger.addSource(file22);
      PDFmerger.addSource(file23);
      PDFmerger.addSource(file24);
      PDFmerger.addSource(file25);
      PDFmerger.addSource(file26);
      PDFmerger.addSource(file27);
      PDFmerger.addSource(file28);
      PDFmerger.addSource(file29);
      PDFmerger.addSource(file30);
      PDFmerger.addSource(file31);
      PDFmerger.addSource(file32);
      PDFmerger.addSource(file33);
      PDFmerger.addSource(file34);
      PDFmerger.addSource(file35);
      PDFmerger.addSource(file36);
      PDFmerger.addSource(file37);
      PDFmerger.addSource(file38);
      PDFmerger.addSource(file39);
      PDFmerger.addSource(file40);
      PDFmerger.addSource(file41);
      PDFmerger.addSource(file42);
      PDFmerger.addSource(file43);
      PDFmerger.addSource(file44);
      PDFmerger.addSource(file45);
      PDFmerger.addSource(file46);
      PDFmerger.addSource(file47);
      PDFmerger.addSource(file48);
      PDFmerger.addSource(file49);
      PDFmerger.addSource(file50);
      PDFmerger.addSource(file51);
      PDFmerger.addSource(file52);
      PDFmerger.addSource(file53);
      PDFmerger.addSource(file54);

      

      
      

      //Merging the two documents
      PDFmerger.mergeDocuments(null);

      System.out.println("Documents merged");
      //Closing the documents
      doc1.close();
      doc2.close();
      doc3.close();
      doc4.close();
      doc5.close();
      doc6.close();
      doc7.close();
      doc8.close();
      doc9.close();
      doc10.close();
      doc11.close();
      doc12.close();
      doc13.close();
      doc14.close();
      doc15.close();
      doc16.close();
      doc17.close();
      doc18.close();
      doc19.close();
      doc20.close();
      doc21.close();
      doc22.close();
      doc23.close();
      doc24.close();
      doc25.close();
      doc26.close();
      doc27.close();
      doc28.close();
      doc29.close();
      doc30.close();
      doc31.close();
      doc32.close();
      doc33.close();
      doc34.close();
      doc35.close();
      doc36.close();
      doc37.close();
      doc38.close();
      doc39.close();
      doc40.close();
      doc41.close();
      doc42.close();
      doc43.close();
      doc44.close();
      doc45.close();
      doc46.close();
      doc47.close();
      doc48.close();
      doc49.close();
      doc50.close();
      doc51.close();
      doc52.close();
      doc53.close();
      doc54.close();
      
   }

}
