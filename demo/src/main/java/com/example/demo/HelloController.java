package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/universities")
    public Map<String, List<String>> getUniversities(@RequestParam(required = false) String department) {
        Map<String, List<String>> universitiesByCountry = new HashMap<>();

        if ("Οικονομικής Επιστήμης".equalsIgnoreCase(department)) {
            universitiesByCountry.put("Αυστρία", EconomicsG.AUSTRIA);
            universitiesByCountry.put("Βέλγιο", EconomicsG.BELGIUM);
            universitiesByCountry.put("Κύπρος", EconomicsG.CYPRUS);
            universitiesByCountry.put("Τσεχία", EconomicsG.CZECH_REPUBLIK);
            universitiesByCountry.put("Δανία", EconomicsG.DENMARK);
            universitiesByCountry.put("Γαλλία", EconomicsG.FRANCE);
            universitiesByCountry.put("Γερμανία", EconomicsG.GERMANY);
            universitiesByCountry.put("Ιρλανδία", EconomicsG.IRELAND);
            universitiesByCountry.put("Ιταλία", EconomicsG.ITALY);
            universitiesByCountry.put("Ολλανδία", EconomicsG.NETHERLANDS);
            universitiesByCountry.put("Πορτογαλία", EconomicsG.PORTUGAL);
            universitiesByCountry.put("Σλοβενία", EconomicsG.SLOVENIA);
            universitiesByCountry.put("Ισπανία", EconomicsG.SPAIN);
            universitiesByCountry.put("Σουηδία", EconomicsG.SWEDEN);
        }
        if ("Διοικητικής Επιστήμης και Τεχνολογίας".equalsIgnoreCase(department)) {
            universitiesByCountry.put("Βέλγιο", DMSTG.BELGIUM);
            universitiesByCountry.put("Κύπρος", DMSTG.CYPRUS);
            universitiesByCountry.put("Δανία", DMSTG.DENMARK);
            universitiesByCountry.put("Φιλανδία", DMSTG.FINLAND);
            universitiesByCountry.put("Γαλλία", DMSTG.FRANCE);
            universitiesByCountry.put("Γερμανία", DMSTG.GERMANY);
            universitiesByCountry.put("Ιταλία", DMSTG.ITALY);
            universitiesByCountry.put("Ολλανδία", DMSTG.NETHERLANDS);
            universitiesByCountry.put("Νορβηγία", DMSTG.NORWAY);
            universitiesByCountry.put("Σλοβακία", DMSTG.SLOVAKIA);
            universitiesByCountry.put("Σουιδία", DMSTG.SWEDEN);
            universitiesByCountry.put("Τουρκία", DMSTG.TURKEY);
        }
        if ("Διεθνών και Ευρωπαϊκών Οικονομικών Σπουδών".equalsIgnoreCase(department)) {
            universitiesByCountry.put("Αυστρία", DIEESG.AUSTRIA);
            universitiesByCountry.put("Βέλγιο", DIEESG.BELGIUM);
            universitiesByCountry.put("Κύπρος", DIEESG.CYPRUS);
            universitiesByCountry.put("Τσεχία", DIEESG.CZECH_REPUBLIK);
            universitiesByCountry.put("Δανία", DIEESG.DENMARK);
            universitiesByCountry.put("Γαλλία", DIEESG.FRANCE);
            universitiesByCountry.put("Γερμανία", DIEESG.GERMANY);
            universitiesByCountry.put("Ιρλανδία", DIEESG.IRELAND);
            universitiesByCountry.put("Ιταλία", DIEESG.ITALY);
            universitiesByCountry.put("Ολλανδία", DIEESG.NETHERLANDS);
            universitiesByCountry.put("Πορτογαλία", DIEESG.PORTUGAL);
            universitiesByCountry.put("Σλοβενία", DIEESG.SLOVENIA);
            universitiesByCountry.put("Ισπανία", DIEESG.SPAIN);
            universitiesByCountry.put("Σουηδία", DIEESG.SWEDEN);            
        }
        if ("Οργάνωσης και Διοίκησης Επιχειρήσεων".equalsIgnoreCase(department)) {
            universitiesByCountry.put("Αυστρία", DBAG.AUSTRIA);
            universitiesByCountry.put("Βέλγιο", DBAG.BELGIUM);
            universitiesByCountry.put("Βουλγαρία", DBAG.BULGARIA);
            universitiesByCountry.put("Κροατία", DBAG.CROATIA);
            universitiesByCountry.put("Κύπρος", DBAG.CYPRUS);
            universitiesByCountry.put("Τσεχία", DBAG.CZECH_REPUBLIC);
            universitiesByCountry.put("Δανία", DBAG.DENMARK);
            universitiesByCountry.put("Εσθονία", DBAG.ESTONIA);
            universitiesByCountry.put("Φινλανδία", DBAG.FINLAND);
            universitiesByCountry.put("Γαλλία", DBAG.FRANCE);
            universitiesByCountry.put("Γερμανία", DBAG.GERMANY);
            universitiesByCountry.put("Ουγγαρία", DBAG.HUNGARY);
            universitiesByCountry.put("Ισλανδία", DBAG.ICELAND);
            universitiesByCountry.put("Ιρλανδία", DBAG.IRELAND);
            universitiesByCountry.put("Ιταλία", DBAG.ITALY);
            universitiesByCountry.put("Λετονία", DBAG.LATVIA);
            universitiesByCountry.put("Λιθουανία", DBAG.LITHUANIA);
            universitiesByCountry.put("Ολλανδία", DBAG.NETHERLANDS);
            universitiesByCountry.put("Νορβηγία", DBAG.NORWAY);
            universitiesByCountry.put("Πολωνία", DBAG.POLAND);
            universitiesByCountry.put("Πορτογαλία", DBAG.PORTUGAL);
            universitiesByCountry.put("Ρουμανία", DBAG.ROMANIA);
            universitiesByCountry.put("Σλοβακία", DBAG.SLOVAKIA);
            universitiesByCountry.put("Σλοβενία", DBAG.SLOVENIA);
            universitiesByCountry.put("Ισπανία", DBAG.SPAIN);
            universitiesByCountry.put("Σουηδία", DBAG.SWEDEN);
            universitiesByCountry.put("Ελβετία", DBAG.SWITZERLAND);
            universitiesByCountry.put("Τουρκία", DBAG.TURKEY);
            universitiesByCountry.put("Ηνωμένο Βασίλειο", DBAG.UNITED_KINGDOM);
        }
        if ("Μάρκετινγκ και Επικοινωνίας".equalsIgnoreCase(department)) {
            universitiesByCountry.put("Αυστρία", DMCG.AUSTRIA);
            universitiesByCountry.put("Βέλγιο", DMCG.BELGIUM);
            universitiesByCountry.put("Βουλγαρία", DMCG.BULGARIA);
            universitiesByCountry.put("Κροατία", DMCG.CROATIA);
            universitiesByCountry.put("Κύπρος", DMCG.CYPRUS);
            universitiesByCountry.put("Τσεχία", DMCG.CZECH_REPUBLIC);
            universitiesByCountry.put("Δανία", DMCG.DENMARK);
            universitiesByCountry.put("Εσθονία", DMCG.ESTONIA);
            universitiesByCountry.put("Φινλανδία", DMCG.FINLAND);
            universitiesByCountry.put("Γαλλία", DMCG.FRANCE);
            universitiesByCountry.put("Γερμανία", DMCG.GERMANY);
            universitiesByCountry.put("Ουγγαρία", DMCG.HUNGARY);
            universitiesByCountry.put("Ισλανδία", DMCG.ICELAND);
            universitiesByCountry.put("Ιρλανδία", DMCG.IRELAND);
            universitiesByCountry.put("Ιταλία", DMCG.ITALY);
            universitiesByCountry.put("Λετονία", DMCG.LATVIA);
            universitiesByCountry.put("Λιθουανία", DMCG.LITHUANIA);
            universitiesByCountry.put("Ολλανδία", DMCG.NETHERLANDS);
            universitiesByCountry.put("Νορβηγία", DMCG.NORWAY);
            universitiesByCountry.put("Πολωνία", DMCG.POLAND);
            universitiesByCountry.put("Πορτογαλία", DMCG.PORTUGAL);
            universitiesByCountry.put("Ρουμανία", DMCG.ROMANIA);
            universitiesByCountry.put("Σλοβακία", DMCG.SLOVAKIA);
            universitiesByCountry.put("Σλοβενία", DMCG.SLOVENIA);
            universitiesByCountry.put("Ισπανία", DMCG.SPAIN);
            universitiesByCountry.put("Σουηδία", DMCG.SWEDEN);
            universitiesByCountry.put("Ελβετία", DMCG.SWITZERLAND);
            universitiesByCountry.put("Τουρκία", DMCG.TURKEY);
            universitiesByCountry.put("Ηνωμένο Βασίλειο", DMCG.UNITED_KINGDOM); 
        }
        if ("Στατιστικής".equalsIgnoreCase(department)) {
            universitiesByCountry.put("Αυστρία", DSG.AUSTRIA);
            universitiesByCountry.put("Βέλγιο", DSG.BELGIUM);
            universitiesByCountry.put("Κύπρος", DSG.CYPRUS);
            universitiesByCountry.put("Γαλλία", DSG.FRANCE);
            universitiesByCountry.put("Γερμανία", DSG.GERMANY);
            universitiesByCountry.put("Ιταλία", DSG.ITALY);
            universitiesByCountry.put("Λετονία", DSG.LATVIA);
            universitiesByCountry.put("Ολλανδία", DSG.NETHERLANDS);
            universitiesByCountry.put("Νορβηγία", DSG.NORWAY);
            universitiesByCountry.put("Πολωνία", DSG.POLAND);
            universitiesByCountry.put("Σλοβακία", DSG.SLOVAKIA);
            universitiesByCountry.put("Ισπανία", DSG.SPAIN);
            universitiesByCountry.put("Σουηδία", DSG.SWEDEN);
            universitiesByCountry.put("Τουρκία", DSG.TURKEY);
            universitiesByCountry.put("Ρουμανία", DSG.ROMANIA);            
        }
        if ("Πληροφορικής".equalsIgnoreCase(department)) {
            universitiesByCountry.put("Αυστρία", CSG.AUSTRIA);
            universitiesByCountry.put("Κύπρος", CSG.CYPRUS);
            universitiesByCountry.put("Γαλλία", CSG.FRANCE); 
            universitiesByCountry.put("Γερμανία", CSG.GERMANY);
            universitiesByCountry.put("Δανία", CSG.DENMARK);
            universitiesByCountry.put("Ιταλία", CSG.ITALY);
            universitiesByCountry.put("Λιθουανία", CSG.LITHUANIA);
            universitiesByCountry.put("Ολλανδία", CSG.NETHERLANDS);
            universitiesByCountry.put("Νορβηγία", CSG.NORWAY);
            universitiesByCountry.put("Πορτογαλία", CSG.PORTUGAL);
            universitiesByCountry.put("Ισπανία", CSG.SPAIN);
            universitiesByCountry.put("Σουηδία", CSG.SWEDEN);
        }
        return universitiesByCountry;
    }
}
