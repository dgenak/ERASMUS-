package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class UniversityInfoProvider {

    public static class UniversityInfo {
        private String city;
        private String description;

        public UniversityInfo(String city, String description) {
            this.city = city;
            this.description = description;
        }

        public String getCity() {
            return city;
        }

        public String getDescription() {
            return description;
        }
    }

    private static final Map<String, UniversityInfo> universityInfoMap = new HashMap<>();

    static {
        // AUSTRIA
        universityInfoMap.put("WU - Vienna University of Economics and Business", new UniversityInfo(
            "Βιέννη, Αυστρία",
            "Το WU βρίσκεται στην ιστορική Βιέννη, ιδρυμένο το 1898. Προσφέρει εξειδικευμένα προγράμματα στις οικονομικές και επιχειρηματικές σπουδές, συνδυάζοντας παραδοσιακές αξίες με καινοτόμες μεθόδους έρευνας. Διακρίνεται για την ακαδημαϊκή του αριστεία και τη διεθνή του συνεργασία."
        ));
        universityInfoMap.put("Johannes Kepler University Linz", new UniversityInfo(
            "Λιντς, Αυστρία",
            "Η Johannes Kepler University Linz ιδρύθηκε το 1964 στη Λιντς και προσφέρει σύγχρονα προγράμματα στις τεχνολογικές και επιχειρηματικές σπουδές. Διακρίνεται για την καινοτομία της, την εφαρμοσμένη έρευνα και τη στενή συνεργασία με τον τοπικό επιχειρηματικό χώρο."
        ));
        universityInfoMap.put("University of Innsbruck - School of Management", new UniversityInfo(
            "Ίνσμπρουκ, Αυστρία",
            "Το School of Management του University of Innsbruck βρίσκεται στο μαγευτικό Ίνσμπρουκ και ιδρύθηκε για να εκπαιδεύσει σε επιχειρηματικές σπουδές. Είναι γνωστό για την καινοτομία, την έρευνα και τη διεθνή του φήμη στον τομέα του management."
        ));

        // BELGIUM
        universityInfoMap.put("Universiteit Gent", new UniversityInfo(
            "Γάνδη, Βέλγιο",
            "Το Universiteit Gent, με έδρα στη Γάνδη, ιδρύθηκε στα τέλη του 19ου αιώνα. Προσφέρει κορυφαία προγράμματα στις επιστήμες, τεχνολογίες και ανθρωπιστικές σπουδές, διακρινόμενο για την εξαιρετική του έρευνα και τις διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Universite Catholique de Louvain - Louvain School of Management", new UniversityInfo(
            "Λούβεν, Βέλγιο",
            "Η Louvain School of Management, μέρος του Universite Catholique de Louvain, συνδυάζει παραδοσιακές αξίες με σύγχρονες μεθόδους διδασκαλίας στις οικονομικές και επιχειρηματικές σπουδές, διακρινόμενο για την καινοτόμο έρευνα και τη διεθνή του συνεργασία."
        ));
        universityInfoMap.put("Universite de Liege", new UniversityInfo(
            "Λιέγη, Βέλγιο",
            "Το Universite de Liege, με έδρα στη Λιέγη, έχει μακρά παράδοση στην εκπαίδευση και έρευνα στις ανθρωπιστικές και φυσικές επιστήμες. Συνδυάζει παραδοσιακή γνώση με σύγχρονες ερευνητικές μεθόδους και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Solvay Brussels School of Economics & Management - Universite Libre de Bruxelles (ULB)", new UniversityInfo(
            "Βρυξέλλες, Βέλγιο",
            "Η Solvay Brussels School, μέρος του ULB στη Βρυξέλλες, είναι διεθνώς αναγνωρισμένη για τα προγράμματά της στις οικονομικές και επιχειρηματικές σπουδές, συνδυάζοντας καινοτομία, εφαρμοσμένη έρευνα και πρακτική διδασκαλία με υψηλές ακαδημαϊκές απαιτήσεις."
        ));
        universityInfoMap.put("KU Leuven - Faculty of Economics and Business", new UniversityInfo(
            "Leuven, Βέλγιο",
            "Η KU Leuven, με έδρα στο Leuven, έχει μακρά ιστορία στις οικονομικές και επιχειρηματικές σπουδές. Προσφέρει προγράμματα υψηλής ποιότητας, συνδυάζοντας παραδοσιακή ακαδημαϊκή γνώση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες."
        ));

        // BULGARIA
        universityInfoMap.put("Sofia University St. Kliment Ohridski", new UniversityInfo(
            "Σόφια, Βουλγαρία",
            "Το Sofia University, ιδρυμένο το 1888 στη Σόφια, είναι το μεγαλύτερο πανεπιστήμιο της Βουλγαρίας. Προσφέρει ποικίλα προγράμματα στις ανθρωπιστικές, φυσικές και κοινωνικές επιστήμες, και διακρίνεται για την ακαδημαϊκή του αριστεία και διεθνείς έρευνες."
        ));

        // CROATIA
        universityInfoMap.put("University of Zagreb", new UniversityInfo(
            "Ζάγκρεμπ, Κροατία",
            "Το University of Zagreb, ιδρυμένο το 1669, είναι το παλαιότερο πανεπιστήμιο της Κροατίας και βρίσκεται στη Ζάγκρεμπ. Διαθέτει ισχυρά προγράμματα στις επιστήμες, τέχνες και ανθρωπιστικές σπουδές, με μακρά ακαδημαϊκή παράδοση και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("University of Split", new UniversityInfo(
            "Σπλιτ, Κροατία",
            "Το University of Split, στην όμορφη πόλη Σπλιτ, προσφέρει σύγχρονα προγράμματα στις τεχνολογικές και ανθρωπιστικές σπουδές. Δίνει έμφαση στην εφαρμοσμένη έρευνα και συμβάλλει στην ανάπτυξη της τοπικής κοινότητας με καινοτόμες προσεγγίσεις."
        ));

        // CYPRUS
        universityInfoMap.put("University of Cyprus", new UniversityInfo(
            "Λευκωσία, Κύπρος",
            "Το University of Cyprus, ένα από τα κορυφαία πανεπιστήμια της Κύπρου, βρίσκεται στη Λευκωσία. Διακρίνεται για την ποιότητα της έρευνας στις επιστήμες, την τεχνολογία και τις ανθρωπιστικές σπουδές, με έμφαση στην καινοτομία και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Open University of Cyprus", new UniversityInfo(
            "Λευκωσία, Κύπρος",
            "Το Open University of Cyprus, με έδρα στη Λευκωσία, παρέχει ευέλικτες σπουδές και στηρίζει τη διά βίου μάθηση. Συνδυάζει θεωρία και πρακτική, ανταποκρινόμενο στις σύγχρονες εκπαιδευτικές ανάγκες μέσω εφαρμοσμένης έρευνας."
        ));

        // CZECH_REPUBLIC
        universityInfoMap.put("University of Economics, Prague (VSE)", new UniversityInfo(
            "Πράγα, Τσεχία",
            "Το University of Economics, Prague (VSE), ιδρυμένο το 1919 στην πρωτεύουσα Τσεχίας, είναι γνωστό για τα προγράμματά του στις οικονομικές σπουδές. Συνδυάζει ιστορική παράδοση με σύγχρονες ερευνητικές μεθόδους και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Mendel University in Brno", new UniversityInfo(
            "Μπρνο, Τσεχία",
            "Το Mendel University in Brno, που βρίσκεται στο Μπρνο, εξειδικεύεται στις γεωπονικές και τεχνολογικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα και την καινοτομία, προωθώντας πρακτικές λύσεις σε τεχνολογικά προβλήματα."
        ));

        // DENMARK
        universityInfoMap.put("Copenhagen Business School", new UniversityInfo(
            "Κοπεγχάγη, Δανία",
            "Η Copenhagen Business School, ιδρυμένη το 1917 στην κοσμοπολίτικη Κοπεγχάγη, προσφέρει εξειδικευμένα προγράμματα στις επιχειρηματικές σπουδές και το marketing. Διακρίνεται για την έρευνα και τη διεθνή συνεργασία, συνδυάζοντας παραδοσιακή γνώση με καινοτόμες μεθόδους διδασκαλίας."
        ));
        universityInfoMap.put("Aarhus University", new UniversityInfo(
            "Άαρχους, Δανία",
            "Το Πανεπιστήμιο του Άαρχους, ιδρυμένο το 1928, βρίσκεται στο Άαρχους και είναι γνωστό για την έμφαση στην έρευνα και την καινοτομία. Προσφέρει σύγχρονα προγράμματα στις τεχνολογικές και επιχειρηματικές σπουδές με ισχυρές διεθνείς συνεργασίες."
        ));

        // ESTONIA
        universityInfoMap.put("Tallinn University of Technology", new UniversityInfo(
            "Ταλίν, Εσθονία",
            "Το Tallinn University of Technology, στην πρωτεύουσα Ταλίν, είναι ένα από τα κορυφαία τεχνολογικά ιδρύματα της Εσθονίας. Προσφέρει εξειδικευμένα προγράμματα στις μηχανικές και τεχνολογικές σπουδές, με έμφαση στην καινοτομία και εφαρμοσμένη έρευνα."
        ));

        // FINLAND
        universityInfoMap.put("Lappeenranta University of Technology", new UniversityInfo(
            "Λαππενραντα, Φινλανδία",
            "Το Lappeenranta University of Technology βρίσκεται στη Φινλανδία και είναι γνωστό για την έρευνα στις τεχνολογικές σπουδές. Συνδυάζει σύγχρονα προγράμματα με εφαρμοσμένη έρευνα και καινοτομία, προσφέροντας εξειδικευμένες λύσεις σε τεχνολογικά ζητήματα."
        ));
        universityInfoMap.put("University of Vaasa", new UniversityInfo(
            "Βάασα, Φινλανδία",
            "Το University of Vaasa, στη Βάασα της Φινλανδίας, εξειδικεύεται στις οικονομικές και επιχειρηματικές σπουδές. Διακρίνεται για την υψηλή ακαδημαϊκή του ποιότητα, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("University of Tampere", new UniversityInfo(
            "Τάμπερε, Φινλανδία",
            "Το University of Tampere, στο Τάμπερε, είναι γνωστό για τα προγράμματά του στις κοινωνικές επιστήμες και την τεχνολογία. Διακρίνεται για την καινοτομία, την εφαρμοσμένη έρευνα και τη συνεργασία με τον επιχειρηματικό τομέα, συνδυάζοντας θεωρητική γνώση με πρακτικές εφαρμογές."
        ));

        // FRANCE
        universityInfoMap.put("IESEG School of Management", new UniversityInfo(
            "Παρίσι, Γαλλία",
            "Η IESEG School of Management, με έδρα στο Παρίσι, είναι διεθνώς αναγνωρισμένη για τα προγράμματά της στις επιχειρηματικές σπουδές και την οικονομία. Συνδυάζει ιστορική παράδοση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες, προωθώντας καινοτομία και αριστεία."
        ));
        universityInfoMap.put("ESC Rennes School of Business", new UniversityInfo(
            "Ρεν, Γαλλία",
            "Η ESC Rennes School of Business, στη Ρεν, προσφέρει προγράμματα στις επιχειρηματικές σπουδές με έμφαση στην καινοτομία και τη διεθνή συνεργασία. Διακρίνεται για την υψηλή ακαδημαϊκή της ποιότητα και την εφαρμοσμένη έρευνα στον τομέα του management."
        ));
        universityInfoMap.put("Université de Montpellier", new UniversityInfo(
            "Μονπελιέ, Γαλλία",
            "Το Université de Montpellier, στη Μονπελιέ, έχει μακρά ιστορία στις φυσικές, βιολογικές και ανθρωπιστικές επιστήμες. Προσφέρει σύγχρονα προγράμματα με έμφαση στην έρευνα και την καινοτομία, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες εκπαιδευτικές μεθόδους."
        ));
        universityInfoMap.put("Institute of Technology Montpellier", new UniversityInfo(
            "Μονπελιέ, Γαλλία",
            "Το Institute of Technology Montpellier εξειδικεύεται στις εφαρμοσμένες τεχνολογίες και την καινοτομία. Βρίσκεται στο Μονπελιέ και προσφέρει πρακτικά προγράμματα, με έμφαση στην εφαρμοσμένη έρευνα και συνεργασία με τον βιομηχανικό τομέα."
        ));
        universityInfoMap.put("Universite Paris Dauphine", new UniversityInfo(
            "Παρίσι, Γαλλία",
            "Το Universite Paris Dauphine, στην καρδιά του Παρισιού, είναι γνωστό για τα προγράμματά του στις οικονομικές και διοικητικές σπουδές. Διαθέτει μακρά παράδοση και συνδυάζει υψηλή ακαδημαϊκή ποιότητα με σύγχρονες ερευνητικές μεθόδους."
        ));
        universityInfoMap.put("Universite Toulouse I Capitole - IAE Toulouse School of Management", new UniversityInfo(
            "Τουλούζη, Γαλλία",
            "Το IAE Toulouse, μέρος του Universite Toulouse I Capitole, βρίσκεται στην Τουλούζη και προσφέρει προγράμματα στη διοίκηση και επιχειρηματικές σπουδές. Είναι γνωστό για την έρευνα, την καινοτομία και τη διεθνή συνεργασία με επιχειρηματικούς φορείς."
        ));
        universityInfoMap.put("Ecole de Management Strasbourg - EM Strasbourg Business School", new UniversityInfo(
            "Στρασβούργο, Γαλλία",
            "Η EM Strasbourg Business School, στο Στρασβούργο, είναι γνωστή για τα προγράμματά της στις επιχειρηματικές σπουδές και τη διοίκηση. Συνδυάζει παραδοσιακές αξίες με σύγχρονες εκπαιδευτικές μεθόδους, προωθώντας διεθνή έρευνα και συνεργασίες."
        ));
        universityInfoMap.put("KEDGE Business School", new UniversityInfo(
            "Μαρκ, Γαλλία",
            "Η KEDGE Business School, με έδρα στη Γαλλία, είναι διεθνώς αναγνωρισμένη για τα προγράμματά της στις επιχειρηματικές σπουδές και το marketing. Διακρίνεται για την καινοτομία, τη διεθνή έρευνα και την εφαρμογή σύγχρονων εκπαιδευτικών μεθόδων."
        ));

        // GERMANY
        universityInfoMap.put("Freie Universitat Berlin", new UniversityInfo(
            "Βερολίνο, Γερμανία",
            "Η Freie Universität Berlin, με έδρα στο Βερολίνο, έχει μακρά ιστορία στις ανθρωπιστικές και κοινωνικές επιστήμες. Διακρίνεται για την υψηλή ακαδημαϊκή ποιότητα, την έρευνα και τις διεθνείς συνεργασίες, αποτελώντας πρότυπο στην εκπαίδευση της Γερμανίας."
        ));
        universityInfoMap.put("Universitat Trier", new UniversityInfo(
            "Τρίερ, Γερμανία",
            "Το Universitat Trier, στο Τρίερ της Γερμανίας, είναι γνωστό για τα προγράμματά του στις ανθρωπιστικές, νομικές και κοινωνικές επιστήμες. Συνδυάζει παραδοσιακή ακαδημαϊκή γνώση με σύγχρονες ερευνητικές μεθόδους και προάγει την καινοτομία."
        ));
        universityInfoMap.put("Technische Universitat Dortmund", new UniversityInfo(
            "Ντόρτμουντ, Γερμανία",
            "Το Technische Universität Dortmund, στο Ντόρτμουντ, εξειδικεύεται στις μηχανικές και τεχνολογικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις σύγχρονες τεχνολογικές προσεγγίσεις στην εκπαίδευση."
        ));

        // HUNGARY
        universityInfoMap.put("Corvinus University of Budapest", new UniversityInfo(
            "Βουδαπέστη, Ουγγαρία",
            "Το Corvinus University of Budapest, στη Βουδαπέστη, είναι διεθνώς αναγνωρισμένο για τα προγράμματά του στις οικονομικές και διοικητικές σπουδές. Διαθέτει μακρά ιστορία, υψηλές ακαδημαϊκές απαιτήσεις και στενές διεθνείς συνεργασίες στον τομέα της έρευνας."
        ));

        // ICELAND
        universityInfoMap.put("University of Iceland", new UniversityInfo(
            "Ρέικαβικ, Ισλανδία",
            "Το University of Iceland, με έδρα στο Ρέικαβικ, είναι το μεγαλύτερο πανεπιστήμιο της Ισλανδίας. Διακρίνεται για τα προγράμματά του στις τεχνολογικές, φυσικές και κοινωνικές επιστήμες, προωθώντας την έρευνα, την καινοτομία και τη διεθνή συνεργασία."
        ));

        // IRELAND
        universityInfoMap.put("University of Limerick", new UniversityInfo(
            "Λίμερικ, Ιρλανδία",
            "Το University of Limerick, στη Λίμερικ της Ιρλανδίας, είναι γνωστό για τα προγράμματά του στις τεχνολογίες και επιχειρηματικές σπουδές. Συνδυάζει σύγχρονες εκπαιδευτικές μεθόδους με διεθνείς συνεργασίες, προωθώντας την καινοτομία και την έρευνα."
        ));

        // ITALY
        universityInfoMap.put("Universita degli Studi di Perugia", new UniversityInfo(
            "Περούγια, Ιταλία",
            "Το Universita degli Studi di Perugia, στην Περούγια της Ιταλίας, έχει μακρά ιστορία και είναι γνωστό για τις ανθρωπιστικές και φυσικές σπουδές. Συνδυάζει παραδοσιακή ιταλική εκπαίδευση με σύγχρονες μεθόδους έρευνας και εφαρμόζει καινοτόμες εκπαιδευτικές πρακτικές."
        ));
        universityInfoMap.put("Universita di Siena", new UniversityInfo(
            "Σιένα, Ιταλία",
            "Το Universita di Siena, στη Σιένα της Ιταλίας, διαθέτει βαθιές ρίζες στην ακαδημαϊκή παράδοση και προσφέρει προγράμματα στις ανθρωπιστικές και φυσικές επιστήμες, συνδυάζοντας ιστορική γνώση με σύγχρονες εκπαιδευτικές μεθόδους."
        ));
        universityInfoMap.put("Sapienza - Universita di Roma", new UniversityInfo(
            "Ρώμη, Ιταλία",
            "Η Sapienza - Universita di Roma, στην ιστορική Ρώμη, είναι ένα από τα μεγαλύτερα πανεπιστήμια της Ιταλίας. Διακρίνεται για τα ισχυρά προγράμματά της στις επιστήμες, τέχνες και ανθρωπιστικές σπουδές, συνδυάζοντας πλούσια ιστορία με σύγχρονες εκπαιδευτικές μεθόδους."
        ));
        universityInfoMap.put("Universita Ca' Foscari Venezia", new UniversityInfo(
            "Βενετία, Ιταλία",
            "Το Universita Ca' Foscari Venezia, στη μαγευτική Βενετία, είναι γνωστό για τις σπουδές του στις ξένες γλώσσες, επιχειρήσεις και ανθρωπιστικές επιστήμες. Συνδυάζει παραδοσιακή ιταλική κουλτούρα με σύγχρονες ακαδημαϊκές μεθόδους και έρευνα."
        ));
        universityInfoMap.put("Universita Carlo Cattaneo - LIUC", new UniversityInfo(
            "Μιλάνο, Ιταλία",
            "Το Universita Carlo Cattaneo - LIUC, στη Μιλάνο, αποτελεί ένα σύγχρονο ίδρυμα που ειδικεύεται στις επιχειρηματικές σπουδές και την τεχνολογία. Διακρίνεται για την καινοτομία, τις εφαρμοσμένες μεθόδους διδασκαλίας και τη διεθνή του συνεργασία."
        ));
        universityInfoMap.put("Universita degli Studi di Firenze", new UniversityInfo(
            "Φλωρεντία, Ιταλία",
            "Το Universita degli Studi di Firenze, στη Φλωρεντία, έχει μακρά παράδοση στην τέχνη, την ιστορία και τις ανθρωπιστικές σπουδές. Συνδυάζει την κλασική ιταλική κουλτούρα με σύγχρονες εκπαιδευτικές και ερευνητικές μεθόδους, προωθώντας την καινοτομία."
        ));
        universityInfoMap.put("LUISS - Libera Universita Internazionale degli Studi Sociali - Guido Carli", new UniversityInfo(
            "Ρώμη, Ιταλία",
            "Η LUISS, με έδρα στη Ρώμη, είναι διεθνώς αναγνωρισμένη για τα προγράμματά της στις κοινωνικές επιστήμες, τη διοίκηση και το δίκαιο. Συνδυάζει υψηλές ακαδημαϊκές απαιτήσεις με καινοτόμες μεθόδους διδασκαλίας και έρευνα, προωθώντας διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("University of Pisa", new UniversityInfo(
            "Πίζα, Ιταλία",
            "Το University of Pisa, στην Πίζα, είναι γνωστό για τις φυσικές, μαθηματικές και τεχνολογικές σπουδές του. Διαθέτει μακρά παράδοση στην έρευνα και καινοτομία, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες εκπαιδευτικές μεθόδους."
        ));
        universityInfoMap.put("Universita degli Studi di Roma \"Tor Vergata\"", new UniversityInfo(
            "Ρώμη, Ιταλία",
            "Το Universita degli Studi di Roma 'Tor Vergata', στη Ρώμη, συνδυάζει σύγχρονες εκπαιδευτικές μεθόδους με παραδοσιακή ακαδημαϊκή ποιότητα, δίνοντας έμφαση στις επιστήμες και την τεχνολογία, ενώ προωθεί τη διεθνή συνεργασία και έρευνα."
        ));
        universityInfoMap.put("Universita degli Studi di Torino", new UniversityInfo(
            "Τόρινο, Ιταλία",
            "Το Universita degli Studi di Torino, στο Τόρινο, είναι γνωστό για τα προγράμματά του στις ανθρωπιστικές, νομικές και τεχνολογικές σπουδές. Με μακρά ιστορία και ακαδημαϊκή παράδοση, συνδυάζει παραδοσιακή γνώση με σύγχρονες ερευνητικές μεθόδους."
        ));
        universityInfoMap.put("Libera Universita Maria Santissimaassunta (LUMSA)", new UniversityInfo(
            "Ρώμη, Ιταλία",
            "Το LUMSA, στη Ρώμη, είναι ένα σύγχρονο ίδρυμα που επικεντρώνεται στις κοινωνικές επιστήμες και την επιχειρηματικότητα. Συνδυάζει πρακτική εφαρμογή με θεμελιώδη ακαδημαϊκή γνώση, προωθώντας καινοτομία και διεθνείς συνεργασίες."
        ));

        // LATVIA
        universityInfoMap.put("Latvijas Universitate", new UniversityInfo(
            "Λιτόβη, Λετονία",
            "Το Latvijas Universitate, το κύριο πανεπιστήμιο της Λετονίας, βρίσκεται στη Λιτόβη. Διακρίνεται για τα προγράμματά του στις ανθρωπιστικές, φυσικές και κοινωνικές επιστήμες, προωθώντας ακαδημαϊκή αριστεία και διεθνείς συνεργασίες."
        ));

        // LITHUANIA
        universityInfoMap.put("Kaunas University of Technology", new UniversityInfo(
            "Καυνας, Λιθουανία",
            "Το Kaunas University of Technology, στη Λιθουανία, εξειδικεύεται στις μηχανικές και τεχνολογικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα και καινοτομία, συνεισφέροντας σημαντικά στον τομέα της τεχνολογίας μέσω πρακτικών εφαρμογών."
        ));
        universityInfoMap.put("Vytautas Magnus University", new UniversityInfo(
            "Καυνας, Λιθουανία",
            "Το Vytautas Magnus University, στη Λιθουανία, προσφέρει προγράμματα στις ανθρωπιστικές και κοινωνικές επιστήμες. Βρίσκεται σε ιστορική πόλη και διακρίνεται για τη δημιουργικότητα, την καινοτομία και τη συνδυαστική του προσέγγιση στην έρευνα."
        ));

        // NETHERLANDS
        universityInfoMap.put("Rotterdam School of Management - Erasmus University Rotterdam", new UniversityInfo(
            "Ρότερνταμ, Ολλανδία",
            "Το Rotterdam School of Management, μέρος του Erasmus University, βρίσκεται στη Ρότερνταμ και είναι διεθνώς αναγνωρισμένο για τα προγράμματά του στις επιχειρηματικές σπουδές. Συνδυάζει καινοτομία, εφαρμοσμένη έρευνα και πρακτική διδασκαλία, προσφέροντας υψηλή ακαδημαϊκή ποιότητα."
        ));
        universityInfoMap.put("Vrije Universiteit Amsterdam", new UniversityInfo(
            "Άμστερνταμ, Ολλανδία",
            "Η Vrije Universiteit Amsterdam, στην καρδιά της Άμστερνταμ, έχει μακρά ιστορία και είναι γνωστή για τα προγράμματά της στις ανθρωπιστικές, κοινωνικές και επιχειρηματικές επιστήμες. Συνδυάζει παραδοσιακή εκπαίδευση με σύγχρονες ερευνητικές μεθόδους και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("The Hague University of Applied Sciences - ESCM European Studies", new UniversityInfo(
            "Ηράκλειο, Ολλανδία",
            "Το The Hague University of Applied Sciences, στο Ηράκλειο, εξειδικεύεται στις εφαρμοσμένες σπουδές και τις ευρωπαϊκές σπουδές. Προσφέρει πρακτικά προγράμματα και προωθεί τη διεθνή συνεργασία, συνδυάζοντας σύγχρονες εκπαιδευτικές μεθόδους με εφαρμοσμένη έρευνα."
        ));
        universityInfoMap.put("University of Groningen", new UniversityInfo(
            "Γκρόνινγκεν, Ολλανδία",
            "Το University of Groningen, ένα από τα παλαιότερα πανεπιστήμια της Ολλανδίας, βρίσκεται στη Γκρόνινγκεν. Διαθέτει ισχυρά προγράμματα στις επιστήμες, τις ανθρωπιστικές και κοινωνικές σπουδές, με έμφαση στην έρευνα και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Radboud University Nijmegen", new UniversityInfo(
            "Νιμαγκεν, Ολλανδία",
            "Το Radboud University Nijmegen, στην Νιμαγκεν, εξειδικεύεται στις επιστήμες και τις κοινωνικές σπουδές. Διαθέτει σύγχρονα προγράμματα και συνδυάζει παραδοσιακή ακαδημαϊκή παράδοση με καινοτόμες ερευνητικές μεθόδους."
        ));
        universityInfoMap.put("Tilburg University - School of Economics and Business", new UniversityInfo(
            "Τίλμπουργκ, Ολλανδία",
            "Το Tilburg University, με έδρα στην Τίλμπουργκ, είναι γνωστό για τα προγράμματά του στις οικονομικές και επιχειρηματικές σπουδές. Διακρίνεται για την ακαδημαϊκή του ποιότητα, την καινοτόμο έρευνα και τη στενή διεθνή συνεργασία στον τομέα του management."
        ));
        universityInfoMap.put("University of Twente", new UniversityInfo(
            "Τβέντε, Ολλανδία",
            "Το University of Twente, στη Τβέντε, εξειδικεύεται στις τεχνολογικές και μηχανικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τη στενή συνεργασία με τον επιχειρηματικό χώρο, προσφέροντας πρακτικές λύσεις σε τεχνολογικά ζητήματα."
        ));

        // NORWAY
        universityInfoMap.put("BI - Norwegian Business School", new UniversityInfo(
            "Οσλο, Νορβηγία",
            "Το BI, ιδρυμένο το 1943 στην Οσλο, είναι το κορυφαίο πανεπιστήμιο επιχειρήσεων στη Νορβηγία. Προσφέρει εξειδικευμένα προγράμματα στις οικονομικές και διοικητικές σπουδές, συνδυάζοντας καινοτομία, εφαρμοσμένη έρευνα και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Norwegian School of Economics - NHH", new UniversityInfo(
            "Οσλο, Νορβηγία",
            "Το NHH, στην Οσλο, είναι ένα από τα κορυφαία πανεπιστήμια οικονομικών στη Νορβηγία. Διακρίνεται για τα προγράμματά του στις οικονομικές επιστήμες, τη διεθνή έρευνα και τις στενές συνεργασίες με τον επιχειρηματικό τομέα."
        ));

        // POLAND
        universityInfoMap.put("Cracow University of Economics", new UniversityInfo(
            "Κράκοβ, Πολωνία",
            "Το Cracow University of Economics, στη Κράκοβ της Πολωνίας, έχει μακρά ιστορία και είναι γνωστό για τα ισχυρά του προγράμματα στις οικονομικές σπουδές. Συνδυάζει ακαδημαϊκή αριστεία με διεθνή έρευνα και στενές συνεργασίες με επιχειρηματικούς φορείς."
        ));
        universityInfoMap.put("Lodz University of Technology", new UniversityInfo(
            "Λοντζ, Πολωνία",
            "Το Lodz University of Technology, στη Λοντζ της Πολωνίας, εξειδικεύεται στις τεχνολογικές και μηχανικές σπουδές. Προσφέρει σύγχρονα προγράμματα και ενισχύει την έρευνα μέσω στενών συνεργασιών με τον τοπικό βιομηχανικό τομέα."
        ));
        universityInfoMap.put("University of Gdansk - Faculty of Economics", new UniversityInfo(
            "Γκντάνσκ, Πολωνία",
            "Το University of Gdansk, στη Γκντάνσκ της Πολωνίας, είναι γνωστό για τα ισχυρά του προγράμματα στις οικονομικές σπουδές. Συνδυάζει παραδοσιακή ακαδημαϊκή γνώση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Kozminski University", new UniversityInfo(
            "Βαρσοβία, Πολωνία",
            "Η Kozminski University, στην Βαρσοβία της Πολωνίας, είναι διεθνώς αναγνωρισμένη για τα προγράμματά της στις διοικητικές και οικονομικές σπουδές. Διακρίνεται για την καινοτομία, την έρευνα και τη στενή συνεργασία με τον επιχειρηματικό κόσμο."
        ));

        // PORTUGAL
        universityInfoMap.put("Universidade de Beira Interior", new UniversityInfo(
            "Μπέιρα Ιντερνέρ, Πορτογαλία",
            "Το Universidade de Beira Interior, στην Πορτογαλία, βρίσκεται σε μια περιοχή με φυσική ομορφιά και προσφέρει εξειδικευμένα προγράμματα στις τεχνολογικές και οικονομικές σπουδές, προωθώντας την καινοτομία και εφαρμοσμένη έρευνα."
        ));
        universityInfoMap.put("Instituto Politecnico Da Guarda (IPG)", new UniversityInfo(
            "Γκουάρδα, Πορτογαλία",
            "Το Instituto Politecnico Da Guarda, στην Πορτογαλία, παρέχει εφαρμοσμένες σπουδές στις μηχανικές και τεχνολογικές επιστήμες, εστιάζοντας στην πρακτική εφαρμογή και έρευνα, με στενές συνεργασίες με τοπικές επιχειρήσεις."
        ));
        universityInfoMap.put("Instituto Politecnico de Leiria", new UniversityInfo(
            "Λείρια, Πορτογαλία",
            "Το Instituto Politecnico de Leiria, στην Πορτογαλία, εξειδικεύεται στις τεχνολογικές σπουδές και τη διοίκηση επιχειρήσεων. Συνδυάζει σύγχρονες εκπαιδευτικές μεθόδους με εφαρμοσμένη έρευνα, προωθώντας την καινοτομία και την πρακτική διδασκαλία."
        ));

        // ROMANIA
        universityInfoMap.put("Universitatea Babes - Bolyai", new UniversityInfo(
            "Κλαζόβε, Ρουμανία",
            "Το Universitatea Babes - Bolyai, στη Κλαζόβε, έχει μακρά ιστορία και είναι γνωστό για τα προγράμματά του στις ανθρωπιστικές και φυσικές επιστήμες. Διακρίνεται για την ακαδημαϊκή του αριστεία και τη διεθνή του έρευνα σε συνεργασία με κορυφαία ιδρύματα."
        ));
        universityInfoMap.put("Alexandru Ioan Cuza - University of Iasi", new UniversityInfo(
            "Ιάσι, Ρουμανία",
            "Το University of Iasi, στην Ιάσι, συνδυάζει παραδοσιακή ακαδημαϊκή ποιότητα με σύγχρονες εκπαιδευτικές μεθόδους στις ανθρωπιστικές και κοινωνικές επιστήμες, διακρινόμενο για τη διεθνή του έρευνα και τις συνεργασίες με παγκόσμια ιδρύματα."
        ));
        universityInfoMap.put("Academia de Studii Economice din Bucuresti (ASE)", new UniversityInfo(
            "Βουκουρέστι, Ρουμανία",
            "Η ASE, στη Βουκουρέστι, είναι γνωστή για τα προγράμματά της στις οικονομικές και διοικητικές σπουδές. Συνδυάζει υψηλές ακαδημαϊκές απαιτήσεις με εφαρμοσμένη έρευνα και διεθνείς συνεργασίες, προωθώντας την καινοτομία στον τομέα των επιχειρήσεων."
        ));
        universityInfoMap.put("West University of Timisoara", new UniversityInfo(
            "Τιμίσοαρα, Ρουμανία",
            "Το West University of Timisoara, στην Τιμίσοαρα, προσφέρει ποιοτικά προγράμματα σε διάφορους τομείς, συνδυάζοντας παραδοσιακή ακαδημαϊκή παράδοση με σύγχρονες ερευνητικές μεθόδους και καινοτομία, προωθώντας τη συνεργασία με επιχειρηματικούς φορείς."
        ));

        // SLOVAKIA
        universityInfoMap.put("Comenius University in Bratislava", new UniversityInfo(
            "Μπρατισλάβα, Σλοβακία",
            "Το Comenius University in Bratislava, το μεγαλύτερο πανεπιστήμιο της Σλοβακίας, βρίσκεται στη Μπρατισλάβα. Διαθέτει μακρά ιστορία στις ανθρωπιστικές και φυσικές επιστήμες και είναι γνωστό για την ακαδημαϊκή του αριστεία και τις διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Matej Bel University in Banska Bystrica", new UniversityInfo(
            "Μπάνσκα Μπύστριτσα, Σλοβακία",
            "Το Matej Bel University in Banska Bystrica, στη Σλοβακία, έχει φήμη για τα καινοτόμα προγράμματά του στις επιστήμες και την τεχνολογία. Διακρίνεται για την εφαρμοσμένη έρευνα και την ανάπτυξη της τοπικής κοινότητας μέσω σύγχρονων εκπαιδευτικών μεθόδων."
        ));

        // SLOVENIA
        universityInfoMap.put("University of Maribor", new UniversityInfo(
            "Μαρίμπορ, Σλοβενία",
            "Το University of Maribor, το δεύτερο μεγαλύτερο πανεπιστήμιο στη Σλοβενία, βρίσκεται στη Μαρίμπορ. Προσφέρει ισχυρά προγράμματα στις τεχνολογικές και ανθρωπιστικές σπουδές και διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("University of Primorska", new UniversityInfo(
            "Κοπελίνα, Σλοβενία",
            "Το University of Primorska, στην περιοχή της Κοπελίνας στη Σλοβενία, είναι γνωστό για τα πρωτοποριακά του προγράμματα στις περιβαλλοντικές και κοινωνικές επιστήμες. Συνδυάζει τοπική κουλτούρα με σύγχρονες μεθόδους διδασκαλίας και διεθνείς ερευνητικές συνεργασίες."
        ));

        // SPAIN
        universityInfoMap.put("Universidad Rey Juan Carlos", new UniversityInfo(
            "Μαδρίτη, Ισπανία",
            "Το Universidad Rey Juan Carlos, στη Μαδρίτη, προσφέρει προγράμματα στις κοινωνικές και επιστήμες, συνδυάζοντας ιστορική παράδοση με σύγχρονες εκπαιδευτικές μεθόδους και διεθνείς συνεργασίες, και διακρίνεται για την έρευνα και την καινοτομία στον ακαδημαϊκό χώρο."
        ));
        universityInfoMap.put("Universitat Abat Oliba CEU", new UniversityInfo(
            "Βαρκελώνη, Ισπανία",
            "Η Universitat Abat Oliba CEU, στη Βαρκελώνη, συνδυάζει παραδοσιακές αξίες με σύγχρονες εκπαιδευτικές μεθόδους στις ανθρωπιστικές και νομικές επιστήμες. Διακρίνεται για τη διεθνή έρευνα, τις συνεργασίες και την εφαρμογή καινοτόμων προγραμμάτων."
        ));
        universityInfoMap.put("Universidad de Alicante", new UniversityInfo(
            "Αλικάντε, Ισπανία",
            "Το Universidad de Alicante, στην Αλικάντε, διακρίνεται για τα προγράμματά του στις επιστήμες, την τεχνολογία και τις ανθρωπιστικές σπουδές. Συνδυάζει παραδοσιακή γνώση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες, προωθώντας καινοτομία."
        ));

        // SWEDEN
        universityInfoMap.put("University of Gothenburg", new UniversityInfo(
            "Γκότναμπουργκ, Σουηδία",
            "Το University of Gothenburg, στη Σουηδία, προσφέρει ισχυρά προγράμματα στις ανθρωπιστικές, κοινωνικές και επιστήμες, διακρινόμενο για την έρευνα και τη διεθνή συνεργασία. Διαθέτει μακρά ακαδημαϊκή παράδοση και προωθεί καινοτόμες μεθόδους διδασκαλίας."
        ));
        universityInfoMap.put("Linnaeus University", new UniversityInfo(
            "Καλμα, Σουηδία",
            "Το Linnaeus University, στην πόλη Καλμα της Σουηδίας, είναι γνωστό για τα προγράμματά του στη βιωσιμότητα, την επιχειρηματικότητα και την έρευνα. Συνδυάζει τοπική κουλτούρα με σύγχρονες εκπαιδευτικές πρακτικές και διεθνείς συνεργασίες."
        ));

        // SWITZERLAND
        universityInfoMap.put("FHS - St. Gallen, University of Applied Sciences", new UniversityInfo(
            "Σεντ Γκάλεν, Ελβετία",
            "Το FHS στο St. Gallen, στην Ελβετία, προσφέρει προγράμματα στις επιχειρηματικές σπουδές και την εφαρμοσμένη έρευνα. Διακρίνεται για την πρακτική του προσέγγιση, την ακαδημαϊκή του ποιότητα και τη στενή διεθνή συνεργασία στον χώρο των επιχειρήσεων."
        ));
        universityInfoMap.put("ZHAW - School of Management and Law", new UniversityInfo(
            "Ζυρή, Ελβετία",
            "Το ZHAW, στη Ζυρή της Ελβετίας, εξειδικεύεται στις διοικητικές σπουδές και το δίκαιο. Συνδυάζει παραδοσιακή γνώση με σύγχρονες μεθόδους έρευνας, προωθώντας εφαρμοσμένη διδασκαλία και διεθνείς συνεργασίες στον τομέα του management."
        ));

        // TURKEY
        universityInfoMap.put("Izmir University of Economics", new UniversityInfo(
            "Ίζμιρ, Τουρκία",
            "Το Izmir University of Economics, στην Ίζμιρ της Τουρκίας, είναι γνωστό για τα εφαρμοσμένα προγράμματά του στις επιχειρηματικές και τεχνολογικές σπουδές. Συνδυάζει καινοτομία με πρακτική έρευνα, υποστηρίζοντας τη συνεργασία με τον επιχειρηματικό χώρο."
        ));
        universityInfoMap.put("Kadir Has University", new UniversityInfo(
            "Ιστανμπούλ, Τουρκία",
            "Η Kadir Has University, στην Ιστανμπούλ, συνδυάζει παραδοσιακές αξίες με σύγχρονες εκπαιδευτικές μεθόδους. Είναι γνωστή για τα προγράμματά της στις επιχειρηματικές και τεχνολογικές σπουδές, προωθώντας την καινοτομία και τη διεθνή συνεργασία."
        ));

        // UNITED_KINGDOM
        universityInfoMap.put("University of Strathclyde - Strathclyde Business School - Department of Marketing", new UniversityInfo(
            "Γκάλουεϊ, Ηνωμένο Βασίλειο",
            "Το University of Strathclyde Business School, στο Γκάλουεϊ, προσφέρει εξειδικευμένα προγράμματα στο μάρκετινγκ και τη διοίκηση. Διακρίνεται για την υψηλή ακαδημαϊκή του ποιότητα, τη διεθνή έρευνα και τη στενή συνεργασία με επιχειρηματικούς φορείς."
        ));
        // BELGIUM
        universityInfoMap.put("Hasselt University", new UniversityInfo(
            "Hasselt, Βέλγιο",
            "Το Hasselt University, που βρίσκεται στο Hasselt του Βελγίου, είναι ένα σύγχρονο ίδρυμα με δυναμική έρευνα και εκπαιδευτικά προγράμματα. Διακρίνεται για τις προσεγγίσεις του στις τεχνολογικές και ανθρωπιστικές σπουδές, με μακρά παράδοση και σύγχρονο εκπαιδευτικό σύστημα, το οποίο συνεχίζει να καινοτομεί."
        ));
        universityInfoMap.put("University of Antwerpen", new UniversityInfo(
            "Antwerpen, Βέλγιο",
            "Το University of Antwerpen, που εδρεύει στην πόλη Antwerpen του Βελγίου, είναι ένα ίδρυμα με μακρά ιστορία. Διακρίνεται για τα προγράμματά του στις τέχνες, επιστήμες και ανθρωπιστικές σπουδές, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες ερευνητικές μεθόδους και διεθνείς συνεργασίες."
        ));

        // CYPRUS
        universityInfoMap.put("University of Cyprus", new UniversityInfo(
            "Λευκωσία, Κύπρος",
            "Το University of Cyprus, που βρίσκεται στη Λευκωσία, είναι ένα από τα κορυφαία πανεπιστήμια της Κύπρου με μακρά ιστορία. Προσφέρει προγράμματα στις επιστήμες, τεχνολογίες και ανθρωπιστικές σπουδές, προωθώντας καινοτομία και διεθνή συνεργασία με σύγχρονο εκπαιδευτικό σύστημα."
        ));
        universityInfoMap.put("University of Nicosia", new UniversityInfo(
            "Νήσος Λευκωσίας, Κύπρος",
            "Το University of Nicosia, στην περιοχή της Λευκωσίας, είναι γνωστό για τα δυναμικά του προγράμματα στις επιχειρηματικές, τεχνολογικές και ανθρωπιστικές σπουδές. Χαρακτηρίζεται από νεωτερικές μεθόδους διδασκαλίας και ισχυρές διεθνείς συνεργασίες, προωθώντας την καινοτομία και τη δημιουργικότητα."
        ));
        universityInfoMap.put("Cyprus University of Technology", new UniversityInfo(
            "Λευκωσία, Κύπρος",
            "Το Cyprus University of Technology, που βρίσκεται στη Λευκωσία, εξειδικεύεται στις εφαρμοσμένες τεχνολογικές σπουδές και την έρευνα. Χαρακτηρίζεται από μια δυναμική προσέγγιση και συνεχείς καινοτομίες, με εφαρμογή σύγχρονων εκπαιδευτικών μεθόδων και στενές συνεργασίες με τον επιχειρηματικό τομέα."
        ));

        // DENMARK
        universityInfoMap.put("University of Southern Denmark", new UniversityInfo(
            "Ντένμποργκ, Δανία",
            "Το University of Southern Denmark, στο Ντένμποργκ, είναι ένα σύγχρονο ίδρυμα με έμφαση στην έρευνα στις τεχνολογικές και κοινωνικές σπουδές. Διακρίνεται για το εφαρμοσμένο εκπαιδευτικό του σύστημα και τις στενές συνεργασίες με τον τοπικό επιχειρηματικό χώρο, προωθώντας υψηλά πρότυπα και διεθνείς συνεργασίες."
        ));

        // FINLAND
        universityInfoMap.put("Abo Akademi University", new UniversityInfo(
            "Αβο, Φινλανδία",
            "Το Abo Akademi University, στη Φινλανδία, είναι γνωστό για τα προγράμματά του στις τέχνες, επιστήμες και ανθρωπιστικές σπουδές. Διακρίνεται για την ισχυρή έρευνα, την καινοτόμο προσέγγιση και διεθνείς συνεργασίες, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες εκπαιδευτικές μεθόδους."
        ));
        universityInfoMap.put("Lahti University of Applied Sciences - LUT University - Lahti Campus", new UniversityInfo(
            "Lahti, Φινλανδία",
            "Το Lahti University of Applied Sciences, γνωστό και ως LUT University - Lahti Campus, βρίσκεται στη Lahti της Φινλανδίας και εξειδικεύεται στις εφαρμοσμένες τεχνολογίες και επιχειρηματικές σπουδές. Συνδυάζει σύγχρονες εκπαιδευτικές προσεγγίσεις με πρακτική έρευνα και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("University of Vaasa", new UniversityInfo(
            "Βάασα, Φινλανδία",
            "Το University of Vaasa, στη Βάασα, είναι γνωστό για τα προγράμματά του στις οικονομικές και επιχειρηματικές σπουδές. Διακρίνεται για την υψηλή ακαδημαϊκή ποιότητα, τη διεθνή συνεργασία και την εφαρμοσμένη έρευνα, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες μεθόδους διδασκαλίας."
        ));
        universityInfoMap.put("University of Jyvaskyla", new UniversityInfo(
            "Γιβάσκυλα, Φινλανδία",
            "Το University of Jyvaskyla, στη Γιβάσκυλα, είναι γνωστό για τα προγράμματά του στις φυσικές και τεχνολογικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τη στενή συνεργασία με τον τοπικό επιχειρηματικό χώρο, ενώ συνεχίζει να αναβαθμίζει τις εκπαιδευτικές του προσεγγίσεις."
        ));

        // FRANCE
        universityInfoMap.put("Audencia Group - Audencia Nantes School of Management", new UniversityInfo(
            "Νάντες, Γαλλία",
            "Η Audencia Group στη Νάντες είναι ένα σύγχρονο ίδρυμα που προσφέρει καινοτόμα προγράμματα στις επιχειρηματικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τον συνδυασμό θεωρητικής γνώσης με πρακτικές εφαρμογές, έχοντας μακρά παράδοση και συνεχείς καινοτομίες."
        ));
        universityInfoMap.put("ESC DIJON BOURGOGNE BSB/ Burgundy School of Business", new UniversityInfo(
            "Γκτιόν, Γαλλία",
            "Η ESC Dijon Bourgogne BSB, στη Γκτιόν, είναι γνωστή για τα εξειδικευμένα προγράμματά της στις επιχειρηματικές σπουδές. Διακρίνεται για την έμφαση στην έρευνα, τις διεθνείς συνεργασίες και τη σύνδεσή της με το τοπικό επιχειρηματικό περιβάλλον, με συνεχείς καινοτομίες."
        ));
        universityInfoMap.put("University of Clermont Auvergne", new UniversityInfo(
            "Clermont Auvergne, Γαλλία",
            "Το University of Clermont Auvergne, στη Clermont Auvergne, φημίζεται για τα προγράμματά του στις φυσικές και κοινωνικές επιστήμες. Συνδυάζει ιστορική παράδοση με σύγχρονες ερευνητικές μεθόδους και διεθνείς συνεργασίες, διατηρώντας υψηλά πρότυπα καινοτομίας."
        ));
        universityInfoMap.put("Universite Paris Nanterre", new UniversityInfo(
            "Ναντερ, Γαλλία",
            "Το Universite Paris Nanterre, στη Ναντερ, είναι γνωστό για τα προγράμματά του στις κοινωνικές και ανθρωπιστικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τη διεθνή συνεργασία και την ενσωμάτωση σύγχρονων εκπαιδευτικών μεθόδων, έχοντας μακρά ακαδημαϊκή παράδοση."
        ));
        universityInfoMap.put("Universite de Strasbourg Ecole de Management Strasbourg - EM Strasbourg Business School", new UniversityInfo(
            "Στρασβούργο, Γαλλία",
            "Το Universite de Strasbourg μέσω της EM Strasbourg Business School, στο Στρασβούργο, είναι γνωστό για τα δυναμικά προγράμματά του στις επιχειρηματικές σπουδές. Συνδυάζει ιστορική παράδοση με σύγχρονες εκπαιδευτικές μεθόδους, προωθώντας διεθνείς συνεργασίες και καινοτομία."
        ));
        universityInfoMap.put("Institut d' Etudes Politique 'Sciences Po Toulouse'", new UniversityInfo(
            "Τουλούζη, Γαλλία",
            "Το Institut d'Etudes Politique 'Sciences Po Toulouse', στη Τουλούζη, είναι γνωστό για τα προγράμματά του στις πολιτικές, κοινωνικές και ανθρωπιστικές σπουδές. Διακρίνεται για την έμφαση στην έρευνα και τις καινοτόμες εκπαιδευτικές μεθόδους, προωθώντας την κοινωνική και πολιτική αλλαγή."
        ));
        universityInfoMap.put("University of Tours", new UniversityInfo(
            "Tours, Γαλλία",
            "Το University of Tours, στη Tours, είναι γνωστό για τα προγράμματά του στις τέχνες, επιστήμες και ανθρωπιστικές σπουδές. Διακρίνεται για την καινοτομία, τη διεθνή έρευνα και τις ισχυρές συνεργασίες με τοπικούς και παγκόσμιους φορείς, ενώ συνεχίζει να εξελίσσεται δυναμικά."
        ));
        universityInfoMap.put("SKEMA Business School", new UniversityInfo(
            "Μαρκ, Γαλλία",
            "Η SKEMA Business School, με έδρα στη Γαλλία, είναι διεθνώς αναγνωρισμένη για τα καινοτόμα προγράμματά της στις επιχειρηματικές σπουδές και το management. Συνδυάζει εφαρμοσμένη έρευνα, διεθνείς συνεργασίες και σύγχρονες εκπαιδευτικές μεθόδους, προωθώντας την επιχειρηματικότητα με μακρά παράδοση."
        ));

        // GERMANY
        universityInfoMap.put("University of Cologne", new UniversityInfo(
            "Κολωνία, Γερμανία",
            "Το University of Cologne, στην ιστορική Κολωνία, είναι ένα από τα κορυφαία πανεπιστήμια της Γερμανίας με έμφαση στις ανθρωπιστικές και κοινωνικές επιστήμες. Διακρίνεται για την ιστορική του παράδοση και τις σύγχρονες ερευνητικές προσεγγίσεις, προωθώντας διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("University of Mannheim", new UniversityInfo(
            "Μάνχαϊμ, Γερμανία",
            "Το University of Mannheim, στη Μάνχαϊμ, είναι γνωστό για τα δυναμικά προγράμματά του στις οικονομικές και κοινωνικές επιστήμες. Συνδυάζει ιστορική παράδοση με σύγχρονες ερευνητικές μεθόδους, προωθώντας εφαρμοσμένη έρευνα και διεθνείς συνεργασίες σε ένα καινοτόμο ακαδημαϊκό περιβάλλον."
        ));
        universityInfoMap.put("Philipps-University Marburg", new UniversityInfo(
            "Μάρμπουργκ, Γερμανία",
            "Το Philipps-University Marburg, στο Μάρμπουργκ, έχει μακρά ιστορία και είναι γνωστό για τις ανθρωπιστικές και φυσικές επιστήμες. Διακρίνεται για την εφαρμοσμένη έρευνα και την ακαδημαϊκή του παράδοση, ενώ συνεχίζει να αναβαθμίζει τα εκπαιδευτικά του πρότυπα."
        ));
        universityInfoMap.put("University of Siegen", new UniversityInfo(
            "Σίγκεν, Γερμανία",
            "Το University of Siegen, στη Σίγκεν, προσφέρει προγράμματα στις φυσικές και κοινωνικές επιστήμες, με έμφαση στην εφαρμοσμένη έρευνα. Διακρίνεται για την καινοτομία και τις διεθνείς συνεργασίες, ενώ συνεχίζει να εξελίσσεται μέσα από συνεχείς καινοτομίες."
        ));
        universityInfoMap.put("Technische Univeristat Hamburg - Hamburg TUHH", new UniversityInfo(
            "Χάμπουργκ, Γερμανία",
            "Το Technische Universität Hamburg – TUHH, στο Χάμπουργκ, εξειδικεύεται στις μηχανικές και τεχνολογικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τη στενή συνεργασία με τον τοπικό βιομηχανικό τομέα, προωθώντας συνεχώς την καινοτομία και τη διεθνή έρευνα."
        ));
        universityInfoMap.put("Technische Univeristat Munchen", new UniversityInfo(
            "Μόναχο, Γερμανία",
            "Το Technische Universität München, στο Μόναχο, είναι ένα κορυφαίο τεχνολογικό ίδρυμα με έμφαση στις μηχανικές και φυσικές επιστήμες. Διακρίνεται για τις σύγχρονες τεχνολογικές εφαρμογές και διεθνείς συνεργασίες, προωθώντας την καινοτομία με έντονες ερευνητικές δραστηριότητες."
        ));
        universityInfoMap.put("Univeristat ULM", new UniversityInfo(
            "ULM, Γερμανία",
            "Το Univeristat ULM, στο ULM, είναι γνωστό για τα προγράμματά του στις μηχανικές και τεχνολογικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα και τις σύγχρονες εκπαιδευτικές μεθόδους, επενδύοντας στην καινοτομία και προωθώντας διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Technische Univeristat Dortmund", new UniversityInfo(
            "Ντόρτμουντ, Γερμανία",
            "Το Technische Universität Dortmund, στο Ντόρτμουντ, εξειδικεύεται στις μηχανικές σπουδές και τις τεχνολογικές εφαρμογές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τη στενή συνεργασία με τον τοπικό βιομηχανικό τομέα, ενώ διατηρεί υψηλά πρότυπα συνεργασίας."
        ));
        universityInfoMap.put("Universität Hamburg", new UniversityInfo(
            "Αμβούργο, Γερμανία",
            "Το Universität Hamburg, στο Αμβούργο, είναι ένα από τα σημαντικότερα πανεπιστήμια της Γερμανίας. Διακρίνεται για τα προγράμματά του στις κοινωνικές, επιστημονικές και τεχνολογικές σπουδές, ενώ συνεχίζει να καινοτομεί μέσω διεθνών συνεργασιών και σύγχρονων ερευνητικών μεθόδων."
        ));
        universityInfoMap.put("SRH Hochshule Berlin - The International Management University", new UniversityInfo(
            "Βερολίνο, Γερμανία",
            "Το SRH Hochschule Berlin, γνωστό και ως The International Management University, στη Βερολίνο, παρέχει εξειδικευμένα προγράμματα στο management και τις επιχειρηματικές σπουδές. Διακρίνεται για την πρακτική εφαρμογή, τις διεθνείς συνεργασίες και την συνεχόμενη καινοτομία στον ακαδημαϊκό χώρο."
        ));
        universityInfoMap.put("Univeristat Koblenz", new UniversityInfo(
            "Koblenz, Γερμανία",
            "Το Univeristat Koblenz, στη Koblenz, είναι γνωστό για τα προγράμματά του στις τεχνολογικές και επιχειρηματικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, ενώ συνεχίζει να αναπτύσσεται με νέες ιδέες."
        ));
        universityInfoMap.put("Univeristat of Munster, School of Business and Economics", new UniversityInfo(
            "Μούνστερ, Γερμανία",
            "Το Univeristat of Munster, School of Business and Economics, στο Μούνστερ, διακρίνεται για τα προγράμματά του στις επιχειρηματικές και οικονομικές σπουδές. Συνδυάζει υψηλά ακαδημαϊκά πρότυπα με διεθνείς συνεργασίες και εφαρμοσμένες ερευνητικές μεθόδους."
        ));
        universityInfoMap.put("Hochschule München University of Applied Sciences", new UniversityInfo(
            "Μόναχο, Γερμανία",
            "Το Hochschule München, University of Applied Sciences, στο Μόναχο, προσφέρει εξειδικευμένα προγράμματα στις τεχνολογικές και πρακτικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, ενώ συνεχίζει να εξελίσσεται με σύγχρονες μεθόδους."
        ));

        // ITALY
        universityInfoMap.put("Universita degli Studi di Catania", new UniversityInfo(
            "Κατάνια, Ιταλία",
            "Το Universita degli Studi di Catania, στην Κατάνια, έχει μακρά ιστορία και είναι γνωστό για τις ανθρωπιστικές και τεχνολογικές σπουδές. Συνδυάζει παραδοσιακές αξίες με σύγχρονες εκπαιδευτικές μεθόδους και έρευνα, προωθώντας την καινοτομία."
        ));
        universityInfoMap.put("Universita degli Studi di Pavia - University of Pavia", new UniversityInfo(
            "Πάβια, Ιταλία",
            "Το Universita degli Studi di Pavia, γνωστό και ως University of Pavia, στην Πάβια, έχει μακρά παράδοση στην έρευνα και διδασκαλία. Διακρίνεται για τα προγράμματά του στις επιστήμες, τέχνες και ανθρωπιστικές σπουδές, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες μεθόδους."
        ));
        universityInfoMap.put("Universita Cattolica del Sacro Cuore", new UniversityInfo(
            "Ρώμη, Ιταλία",
            "Το Universita Cattolica del Sacro Cuore, στη Ρώμη, είναι ένα από τα κορυφαία πανεπιστήμια της Ιταλίας. Διακρίνεται για τις ανθρωπιστικές, κοινωνικές και νομικές σπουδές, ενώ συνδυάζει υψηλά ακαδημαϊκά πρότυπα με διεθνείς συνεργασίες και σύγχρονες ερευνητικές μεθόδους."
        ));
        universityInfoMap.put("Universita degli Studi di Torino (ECOMAS)", new UniversityInfo(
            "Τόρινο, Ιταλία",
            "Το Universita degli Studi di Torino (ECOMAS), στο Τόρινο, είναι γνωστό για τα προγράμματά του στις οικονομικές και επιχειρηματικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα και καινοτομία, συνδυάζοντας ιστορική παράδοση με σύγχρονες μεθόδους διδασκαλίας."
        ));
        universityInfoMap.put("Universita degli Studi di Torino Dept. 'Valter Cantino' (SAA campus)", new UniversityInfo(
            "Τόρινο, Ιταλία",
            "Το Universita degli Studi di Torino Dept. 'Valter Cantino' (SAA campus), στο Τόρινο, προσφέρει εξειδικευμένα προγράμματα στις επιχειρηματικές και κοινωνικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα και την καινοτομία, προωθώντας την ακαδημαϊκή αριστεία μέσω σύγχρονων εκπαιδευτικών προσεγγίσεων."
        ));

        // NETHERLANDS
        universityInfoMap.put("The Hague University of Applied Sciences - ESCM European Studies", new UniversityInfo(
            "Ηράκλειο, Ολλανδία",
            "Το The Hague University of Applied Sciences, γνωστό και ως ESCM European Studies, βρίσκεται στο Ηράκλειο. Εξειδικεύεται στις εφαρμοσμένες σπουδές και τις ευρωπαϊκές σπουδές, συνδυάζοντας καινοτομία, διεθνείς συνεργασίες και πρακτική έρευνα με σύγχρονες εκπαιδευτικές μεθόδους."
        ));

        // NORWAY
        universityInfoMap.put("BI - Norwegian Business School", new UniversityInfo(
            "Οσλο, Νορβηγία",
            "Το BI - Norwegian Business School, στην Οσλο, είναι το κορυφαίο ίδρυμα επιχειρηματικών σπουδών στη Νορβηγία. Διακρίνεται για τα προγράμματά του στις οικονομικές σπουδές, την έρευνα και τις διεθνείς συνεργασίες, με έμφαση στην καινοτομία."
        ));
        universityInfoMap.put("Norwegian School of Economics - NHH", new UniversityInfo(
            "Οσλο, Νορβηγία",
            "Το Norwegian School of Economics - NHH, στην Οσλο, είναι ένα από τα κορυφαία πανεπιστήμια οικονομικών στη Νορβηγία. Διακρίνεται για τα ισχυρά του προγράμματα, τη διεθνή έρευνα και τις στενές συνεργασίες με τον επιχειρηματικό τομέα."
        ));

        // SLOVAKIA
        universityInfoMap.put("Univerzita Pavla Jozefa Safarika v Kosiciach", new UniversityInfo(
            "Κοσίτσα, Σλοβακία",
            "Το Univerzita Pavla Jozefa Safarika, στη Κοσίτσα, είναι γνωστό για τα προγράμματά του στις ανθρωπιστικές και κοινωνικές επιστήμες. Διακρίνεται για την έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, ενώ προάγει τη δημιουργικότητα των φοιτητών."
        ));

        // SWEDEN
        universityInfoMap.put("Stockholm University - Stockholm Business School", new UniversityInfo(
            "Στοκχόλμ, Σουηδία",
            "Το Stockholm University - Stockholm Business School, στο Στοκχόλμ, είναι γνωστό για τα προγράμματά του στις επιχειρηματικές και κοινωνικές σπουδές. Διακρίνεται για την έρευνα, τις διεθνείς συνεργασίες και την εφαρμογή σύγχρονων εκπαιδευτικών μεθόδων."
        ));
        universityInfoMap.put("Linnaeus University", new UniversityInfo(
            "Καλμα, Σουηδία",
            "Το Linnaeus University, στην Καλμα, είναι γνωστό για τα προγράμματά του στις επιχειρηματικές, κοινωνικές και τεχνολογικές σπουδές. Διακρίνεται για την καινοτομία, την εφαρμοσμένη έρευνα και τη διεθνή συνεργασία, προωθώντας συνεχώς την έρευνα σε παγκόσμιο επίπεδο."
        ));
        universityInfoMap.put("Kristianstad University", new UniversityInfo(
            "Σκρανιστάν, Σουηδία",
            "Το Kristianstad University, στη Σκρανιστάν, είναι γνωστό για τα προγράμματά του στις τεχνολογικές και ανθρωπιστικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα και την καινοτομία, ενώ προάγει τη συνεργασία με τοπικούς και διεθνείς φορείς."
        ));
        universityInfoMap.put("Sodertorn University", new UniversityInfo(
            "Σότερτορν, Σουηδία",
            "Το Sodertorn University, στη Σότερτορν, είναι γνωστό για τα προγράμματά του στις επιχειρηματικές και κοινωνικές σπουδές. Διακρίνεται για την εφαρμογή σύγχρονων εκπαιδευτικών μεθόδων, την έρευνα και τη διεθνή συνεργασία, συνεχίζοντας να καινοτομεί."
        ));

        // TURKEY
        universityInfoMap.put("University of Istanbul", new UniversityInfo(
            "Κωνσταντινούπολη, Τουρκία",
            "Το University of Istanbul, στην ιστορική Κωνσταντινούπολη, είναι γνωστό για τα προγράμματά του στις ανθρωπιστικές, τεχνολογικές και επιχειρηματικές σπουδές. Διακρίνεται για την πλούσια ακαδημαϊκή του παράδοση, την έρευνα και τη διεθνή συνεργασία, προάγοντας την καινοτομία."
        ));
        // AUSTRIA
        universityInfoMap.put("WU - Vienna University of Economics and Business", new UniversityInfo(
            "Βιέννη, Αυστρία",
            "Το WU, ιδρυμένο το 1898 στη Βιέννη, προσφέρει υψηλής ποιότητας προγράμματα στις οικονομικές και επιχειρηματικές σπουδές. Διακρίνεται για την έρευνά του, τις διεθνείς συνεργασίες και την καινοτόμο προσέγγιση, ενσωματώνοντας την ιστορική κληρονομιά της πόλης."
        ));
        universityInfoMap.put("University of Innsbruck - School of Management", new UniversityInfo(
            "Ίνσμπρουκ, Αυστρία",
            "Το School of Management του University of Innsbruck βρίσκεται στο γραφικό Ίνσμπρουκ και ιδρύθηκε για να προσφέρει σύγχρονα προγράμματα στη διοίκηση. Διακρίνεται για την καινοτομία, την εφαρμοσμένη έρευνα και τη σύνδεση παραδοσιακών αξιών με σύγχρονες εκπαιδευτικές μεθόδους."
        ));

        // BELGIUM
        universityInfoMap.put("Universite Catholique de Louvain (UCL) - Louvain School of Management", new UniversityInfo(
            "Λούβεν, Βέλγιο",
            "Το UCL - Louvain School of Management, στη Λούβεν, έχει μακρά ιστορία και προσφέρει εξειδικευμένα προγράμματα στις επιχειρηματικές σπουδές. Συνδυάζει παραδοσιακές αξίες με σύγχρονες μεθόδους και διεθνείς συνεργασίες, προωθώντας την καινοτομία στον ακαδημαϊκό χώρο."
        ));
        universityInfoMap.put("Universite de Liege", new UniversityInfo(
            "Λιέγη, Βέλγιο",
            "Το Universite de Liege, στην πόλη Λιέγη, έχει ιστορική παράδοση και προσφέρει ολοκληρωμένα προγράμματα στις επιστήμες και ανθρωπιστικές σπουδές. Επικεντρώνεται στην έρευνα και τις διεθνείς συνεργασίες, διατηρώντας υψηλά ακαδημαϊκά πρότυπα."
        ));
        universityInfoMap.put("Solvay Brussels School of Economics & Management - Universite Libre de Bruxelles (ULB)", new UniversityInfo(
            "Βρυξέλλες, Βέλγιο",
            "Η Solvay Brussels School στο ULB, στις Βρυξέλλες, είναι διεθνώς αναγνωρισμένη για τα προγράμματά της στις οικονομικές σπουδές. Συνδυάζει εφαρμοσμένη έρευνα με παραδοσιακή ακαδημαϊκή γνώση και διεθνείς συνεργασίες, προωθώντας την καινοτομία."
        ));
        universityInfoMap.put("Universiteit Antwerpen", new UniversityInfo(
            "Antwerpen, Βέλγιο",
            "Το Universiteit Antwerpen βρίσκεται στην πόλη Antwerpen και προσφέρει προγράμματα στις επιχειρηματικές, κοινωνικές και τεχνολογικές σπουδές. Διακρίνεται για την έρευνα, την εφαρμογή σύγχρονων μεθόδων και τις διεθνείς συνεργασίες, συνδυάζοντας τοπική παράδοση με καινοτομία."
        ));
        universityInfoMap.put("KU Leuven - Faculty of Economics and Business (Antwerp Carolus Campus, Brussels Campus, Leuven Campus)", new UniversityInfo(
            "Leuven, Βέλγιο",
            "Η KU Leuven διαθέτει πολλαπλά campus και είναι πρότυπο στην εκπαίδευση των οικονομικών και επιχειρηματικών σπουδών. Διακρίνεται για την έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, συνδυάζοντας ιστορική παράδοση με σύγχρονες εκπαιδευτικές πρακτικές."
        ));

        // BULGARIA
        universityInfoMap.put("Varna Free University \"Chernorizets Hrabar\"", new UniversityInfo(
            "Varna, Βουλγαρία",
            "Το Varna Free University, γνωστό και ως Chernorizets Hrabar, βρίσκεται στην παραθαλάσσια Varna. Προσφέρει προγράμματα στις τεχνολογικές και ανθρωπιστικές σπουδές, συνδυάζοντας σύγχρονες εκπαιδευτικές μεθόδους με παραδοσιακές αξίες και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("New Bulgarian University", new UniversityInfo(
            "Σόφια, Βουλγαρία",
            "Το New Bulgarian University στη Σόφια είναι ένα σύγχρονο ίδρυμα με έμφαση στις κοινωνικές και ανθρωπιστικές σπουδές. Διακρίνεται για την καινοτομία, την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες που το καθιστούν πρότυπο στην εκπαίδευση."
        ));

        // CROATIA
        universityInfoMap.put("University of Zagreb", new UniversityInfo(
            "Ζάγκρεμπ, Κροατία",
            "Το University of Zagreb, ιδρυμένο το 1669, είναι το παλαιότερο πανεπιστήμιο της Κροατίας και προσφέρει ολοκληρωμένα προγράμματα σε τέχνες, επιστήμες και ανθρωπιστικές σπουδές, με έμφαση στην ιστορική παράδοση και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("University of Split", new UniversityInfo(
            "Σπλιτ, Κροατία",
            "Το University of Split, στη Σπλιτ, προσφέρει σύγχρονα προγράμματα στις τεχνολογικές και ανθρωπιστικές σπουδές, συνδυάζοντας εφαρμοσμένη έρευνα με καινοτόμες εκπαιδευτικές μεθόδους, και προωθεί τοπικές και διεθνείς συνεργασίες."
        ));

        // CYPRUS
        universityInfoMap.put("University of Cyprus", new UniversityInfo(
            "Λευκωσία, Κύπρος",
            "Το University of Cyprus, στη Λευκωσία, είναι το κορυφαίο ίδρυμα της χώρας. Προσφέρει προγράμματα στις επιστήμες, τεχνολογίες και ανθρωπιστικές σπουδές, συνδυάζοντας ιστορική παράδοση με σύγχρονες εκπαιδευτικές μεθόδους και διεθνείς συνεργασίες."
        ));

        // CZECH_REPUBLIC
        universityInfoMap.put("University of Economics, Prague (VSE)", new UniversityInfo(
            "Πράγα, Τσεχία",
            "Το VSE στην Πράγα είναι εξειδικευμένο στις οικονομικές σπουδές και διαθέτει ισχυρή ακαδημαϊκή παράδοση. Συνδυάζει παραδοσιακή γνώση με σύγχρονες μεθόδους διδασκαλίας και διεθνείς συνεργασίες, προωθώντας έρευνα και καινοτομία."
        ));
        universityInfoMap.put("Masaryk University - Faculty of Economics and Administration", new UniversityInfo(
            "Μπρνο, Τσεχία",
            "Η Masaryk University στο Μπρνο, Τσεχία, είναι γνωστή για τα προγράμματά της στις οικονομικές και διοικητικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις καινοτόμες εκπαιδευτικές μεθόδους και τις διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("BRNO University of Technology - Faculty of Business and Management", new UniversityInfo(
            "Μπρνο, Τσεχία",
            "Το BRNO University of Technology, στο Μπρνο, έχει το τμήμα Business and Management που συνδυάζει εφαρμοσμένη έρευνα με σύγχρονες εκπαιδευτικές πρακτικές, ενσωματώνοντας παραδοσιακές αξίες με καινοτόμες μεθόδους."
        ));

        // DENMARK
        universityInfoMap.put("Copenhagen Business School", new UniversityInfo(
            "Κοπεγχάγη, Δανία",
            "Η Copenhagen Business School, ιδρυμένη το 1917 στην Κοπεγχάγη, είναι διεθνώς αναγνωρισμένη για τα προγράμματά της στις επιχειρηματικές σπουδές, την έρευνα και τις διεθνείς συνεργασίες, προσφέροντας καινοτόμες εκπαιδευτικές μεθόδους."
        ));
        universityInfoMap.put("Aarhus University", new UniversityInfo(
            "Άαρχους, Δανία",
            "Το Aarhus University, στο Άαρχους, εστιάζει στην έρευνα και καινοτομία στις τεχνολογικές και επιχειρηματικές σπουδές. Προσφέρει ολοκληρωμένα προγράμματα με διεθνείς συνεργασίες, συνδυάζοντας παραδοσιακή ακαδημαϊκή γνώση με σύγχρονες μεθόδους διδασκαλίας."
        ));

        // ESTONIA
        universityInfoMap.put("Tallin University of Technology", new UniversityInfo(
            "Ταλίν, Εσθονία",
            "Το Tallin University of Technology, στην πρωτεύουσα της Εσθονίας, προσφέρει εξειδικευμένα προγράμματα στις μηχανικές και τεχνολογικές σπουδές. Διακρίνεται για την καινοτομία, την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες που προωθούν την τεχνολογική ανάπτυξη."
        ));

        // FINLAND
        universityInfoMap.put("Lappeenranta University of Technology", new UniversityInfo(
            "Λαππενραντα, Φινλανδία",
            "Το Lappeenranta University of Technology, στη Λαππενραντα, είναι γνωστό για την έρευνα και τις εφαρμοσμένες τεχνολογικές σπουδές. Συνδυάζει καινοτόμες μεθόδους διδασκαλίας με πρακτική εφαρμογή και διεθνείς συνεργασίες, προωθώντας την τεχνολογία."
        ));
        universityInfoMap.put("University of Vaasa", new UniversityInfo(
            "Βάασα, Φινλανδία",
            "Το University of Vaasa, στη Βάασα, εξειδικεύεται στις οικονομικές και επιχειρηματικές σπουδές. Διακρίνεται για τα υψηλά ακαδημαϊκά πρότυπα, την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες, προσφέροντας ένα σύγχρονο εκπαιδευτικό περιβάλλον."
        ));
        universityInfoMap.put("University of Tampere - TAU business", new UniversityInfo(
            "Τάμπερε, Φινλανδία",
            "Το University of Tampere - TAU business, στο Τάμπερε, είναι γνωστό για τα προγράμματά του στις επιχειρηματικές και κοινωνικές σπουδές. Διαθέτει σύγχρονες μεθόδους διδασκαλίας και ενσωματώνει εφαρμοσμένη έρευνα και διεθνείς συνεργασίες."
        ));

        // FRANCE
        universityInfoMap.put("IESEG School of Management (Campus Lille - Campus Paris)", new UniversityInfo(
            "Παρίσι/Λιέ, Γαλλία",
            "Η IESEG School of Management, με campus στο Λιέ και στο Παρίσι, προσφέρει προγράμματα στις επιχειρηματικές σπουδές. Διακρίνεται για την καινοτομία, την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες, συνδυάζοντας ιστορική παράδοση με σύγχρονες εκπαιδευτικές πρακτικές."
        ));
        universityInfoMap.put("ESC - Rennes School of Business", new UniversityInfo(
            "Ρεν, Γαλλία",
            "Η ESC Rennes School of Business, στη Ρεν, είναι γνωστή για τα δυναμικά της προγράμματα στις επιχειρηματικές σπουδές. Συνδυάζει καινοτόμες εκπαιδευτικές μεθόδους με εφαρμοσμένη έρευνα και διεθνείς συνεργασίες, προωθώντας την επιχειρηματικότητα."
        ));
        universityInfoMap.put("Université de Montpellier - Institut d’Administration des Entreprises (IAE Montpellier)", new UniversityInfo(
            "Μονπελιέ, Γαλλία",
            "Το IAE Montpellier, μέρος του Université de Montpellier, βρίσκεται στη Μονπελιέ και εξειδικεύεται στη διοίκηση επιχειρήσεων. Συνδυάζει ιστορική παράδοση με σύγχρονες μεθόδους διδασκαλίας και εφαρμοσμένη έρευνα, ενισχύοντας διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Institute of Technology Montpellier - Sete / Sciences et Techniques", new UniversityInfo(
            "Μονπελιέ/Sete, Γαλλία",
            "Το Institute of Technology Montpellier, στο Sete της Γαλλίας, εστιάζει στις εφαρμοσμένες τεχνολογίες και επιστήμες. Διακρίνεται για την καινοτομία, την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες, προσφέροντας πρακτικά προγράμματα σε σύγχρονο περιβάλλον."
        ));
        universityInfoMap.put("Universite Paris Dauphine", new UniversityInfo(
            "Παρίσι, Γαλλία",
            "Το Universite Paris Dauphine, στο Παρίσι, είναι γνωστό για τα προγράμματά του στις οικονομικές και διοικητικές σπουδές. Συνδυάζει μακρά ιστορία με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες, προωθώντας την ακαδημαϊκή αριστεία."
        ));
        universityInfoMap.put("UPEC - Universite Paris - Est Creteil Val de Marne | IAE Gustave Eiffel", new UniversityInfo(
            "Κρετέιλ, Γαλλία",
            "Το UPEC, στο Creteil της Γαλλίας, μέσω του IAE Gustave Eiffel, προσφέρει προγράμματα στη διοίκηση επιχειρήσεων. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, συνδυάζοντας τοπική παράδοση με σύγχρονες εκπαιδευτικές μεθόδους."
        ));
        universityInfoMap.put("Universite Toulouse I Capitole - IAE Toulouse School of Management", new UniversityInfo(
            "Τουλούζη, Γαλλία",
            "Το IAE Toulouse, μέρος του Universite Toulouse I Capitole, βρίσκεται στην Τουλούζη και είναι γνωστό για τα προγράμματά του στη διοίκηση. Συνδυάζει παραδοσιακή γνώση με εφαρμοσμένη έρευνα και διεθνείς συνεργασίες, προωθώντας την καινοτομία στον τομέα του management."
        ));
        universityInfoMap.put("Ecole de Management Strasbourg - EM Strasbourg Business School", new UniversityInfo(
            "Στρασβούργο, Γαλλία",
            "Η EM Strasbourg Business School, στο Στρασβούργο, προσφέρει προγράμματα στις επιχειρηματικές σπουδές με έμφαση στην έρευνα και καινοτομία. Συνδυάζει ιστορική παράδοση με σύγχρονες εκπαιδευτικές μεθόδους και διεθνείς συνεργασίες, προωθώντας τη δημιουργικότητα."
        ));
        universityInfoMap.put("Universite de Nantes (IUT)", new UniversityInfo(
            "Νάντες, Γαλλία",
            "Το Universite de Nantes μέσω του IUT βρίσκεται στη Νάντες και προσφέρει εφαρμοσμένα προγράμματα στις τεχνολογικές και επιστημονικές σπουδές. Διακρίνεται για την πρακτική του διδασκαλία, την έρευνα και τις διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Universite Paris 13", new UniversityInfo(
            "Παρίσι, Γαλλία",
            "Το Universite Paris 13, στο Παρίσι, είναι ένα σύγχρονο ίδρυμα με έμφαση στις κοινωνικές και επιστημονικές σπουδές. Διαθέτει ισχυρά προγράμματα, εφαρμοσμένη έρευνα και διεθνείς συνεργασίες, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες εκπαιδευτικές μεθόδους."
        ));
        universityInfoMap.put("EXCELIA / Ecole Superieure de Commerce La Rochelle", new UniversityInfo(
            "La Rochelle, Γαλλία",
            "Η EXCELIA, στην La Rochelle, είναι γνωστή για τα προγράμματά της στις επιχειρηματικές σπουδές και το εμπόριο. Συνδυάζει εφαρμοσμένη έρευνα, καινοτόμες εκπαιδευτικές μεθόδους και διεθνείς συνεργασίες, προωθώντας την επιχειρηματικότητα σε ένα σύγχρονο πλαίσιο."
        ));
        universityInfoMap.put("PSB - Paris School of Business", new UniversityInfo(
            "Παρίσι, Γαλλία",
            "Η PSB, στο Παρίσι, είναι διεθνώς αναγνωρισμένη για τα προγράμματά της στις επιχειρηματικές σπουδές και το management. Διαθέτει σύγχρονες εκπαιδευτικές μεθόδους, έμφαση στην έρευνα και διεθνείς συνεργασίες, συνδυάζοντας ιστορική παράδοση με καινοτόμα προγράμματα."
        ));

        // GERMANY
        universityInfoMap.put("University of Cologne", new UniversityInfo(
            "Κολωνία, Γερμανία",
            "Το University of Cologne, στην ιστορική Κολωνία, προσφέρει ολοκληρωμένα προγράμματα στις κοινωνικές, ανθρωπιστικές και επιστημονικές σπουδές. Διακρίνεται για την ιστορική του παράδοση, την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Leibniz Universitat Hannover", new UniversityInfo(
            "Hannover, Γερμανία",
            "Το Leibniz Universitat Hannover, στη Hannover, είναι γνωστό για τα προγράμματά του στις μηχανικές και φυσικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, ενσωματώνοντας παραδοσιακές αξίες με σύγχρονες τεχνολογικές μεθόδους."
        ));
        universityInfoMap.put("Universitat Regensburg", new UniversityInfo(
            "Regensburg, Γερμανία",
            "Το Universitat Regensburg, στη Regensburg, προσφέρει προγράμματα στις ανθρωπιστικές και κοινωνικές σπουδές. Με μακρά ιστορία και ισχυρές διεθνείς συνεργασίες, συνδυάζει παραδοσιακή ακαδημαϊκή γνώση με σύγχρονες μεθόδους έρευνας."
        ));
        universityInfoMap.put("Johan Wolfgang Goethe Universitat", new UniversityInfo(
            "Φραγκφούρτη, Γερμανία",
            "Η Johann Wolfgang Goethe Universität, στο Φραγκφούρτη, είναι ένα από τα πιο διακεκριμένα πανεπιστήμια της Γερμανίας. Διακρίνεται για τα προγράμματά του στις οικονομικές, κοινωνικές και ανθρωπιστικές σπουδές, με έμφαση στην εφαρμοσμένη έρευνα και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Universität Hamburg", new UniversityInfo(
            "Αμβούργο, Γερμανία",
            "Το Universität Hamburg, στο Αμβούργο, προσφέρει προγράμματα στις κοινωνικές, επιστημονικές και τεχνολογικές σπουδές. Διακρίνεται για την ιστορική του παράδοση, την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες εκπαιδευτικές μεθόδους."
        ));
        universityInfoMap.put("Duale Hochschule Baden - Wuerttemberg", new UniversityInfo(
            "Baden-Württemberg, Γερμανία",
            "Η Duale Hochschule Baden-Württemberg, στη Γερμανία, προσφέρει εφαρμοσμένα προγράμματα στις τεχνολογικές και επιχειρηματικές σπουδές. Διακρίνεται για την πρακτική διδασκαλία, την εφαρμοσμένη έρευνα και τις στενές συνεργασίες με τον τοπικό βιομηχανικό τομέα."
        ));

        // HUNGARY
        universityInfoMap.put("Corvinus University in Budapest", new UniversityInfo(
            "Βουδαπέστη, Ουγγαρία",
            "Το Corvinus University in Budapest, στην πρωτεύουσα της Ουγγαρίας, είναι γνωστό για τα προγράμματά του στις οικονομικές και διοικητικές σπουδές. Διακρίνεται για την έρευνα, τις διεθνείς συνεργασίες και την εφαρμογή σύγχρονων εκπαιδευτικών μεθόδων."
        ));

        // ICELAND
        universityInfoMap.put("University of Iceland", new UniversityInfo(
            "Ρέικαβικ, Ισλανδία",
            "Το University of Iceland, στο Ρέικαβικ, είναι το μεγαλύτερο πανεπιστήμιο της Ισλανδίας. Διαθέτει προγράμματα στις τεχνολογικές, φυσικές και κοινωνικές σπουδές και διακρίνεται για την έρευνα, την καινοτομία και τις διεθνείς συνεργασίες."
        ));

        // IRELAND
        universityInfoMap.put("University of Limerick", new UniversityInfo(
            "Λίμερικ, Ιρλανδία",
            "Το University of Limerick, στη Λίμερικ, είναι γνωστό για τα δυναμικά προγράμματά του στις τεχνολογίες και επιχειρηματικές σπουδές. Διακρίνεται για την έρευνα, τις διεθνείς συνεργασίες και την εφαρμογή σύγχρονων εκπαιδευτικών μεθόδων."
        ));

        // ITALY
        universityInfoMap.put("Universita degli Studi di Perugia", new UniversityInfo(
            "Περούγια, Ιταλία",
            "Το Universita degli Studi di Perugia, στην Περούγια, έχει μακρά ιστορία και είναι γνωστό για τις ανθρωπιστικές και φυσικές σπουδές. Συνδυάζει παραδοσιακή ιταλική εκπαίδευση με σύγχρονες μεθόδους διδασκαλίας και εφαρμοσμένη έρευνα."
        ));
        universityInfoMap.put("Universita di Siena", new UniversityInfo(
            "Σιένα, Ιταλία",
            "Το Universita di Siena, στη Σιένα, έχει βαθιές ρίζες στην ακαδημαϊκή παράδοση και προσφέρει ισχυρά προγράμματα στις ανθρωπιστικές και τεχνολογικές σπουδές. Διακρίνεται για την έρευνα, την εφαρμογή σύγχρονων μεθόδων και τις διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Sapienza - Universita di Roma", new UniversityInfo(
            "Ρώμη, Ιταλία",
            "Η Sapienza - Universita di Roma, στην ιστορική Ρώμη, είναι ένα από τα μεγαλύτερα πανεπιστήμια της Ιταλίας με έμφαση στις επιστήμες, τέχνες και ανθρωπιστικές σπουδές, συνδυάζοντας ιστορική παράδοση με σύγχρονες μεθόδους έρευνας."
        ));
        universityInfoMap.put("Universita Ca' Foscari Venezia", new UniversityInfo(
            "Βενετία, Ιταλία",
            "Το Universita Ca' Foscari Venezia, στη Βενετία, είναι γνωστό για τις σπουδές του στις ξένες γλώσσες, επιχειρηματικές και ανθρωπιστικές επιστήμες. Συνδυάζει την ιστορία της Βενετίας με σύγχρονες εκπαιδευτικές πρακτικές και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Universita Carlo Cattaneo - LIUC", new UniversityInfo(
            "Μιλάνο, Ιταλία",
            "Το Universita Carlo Cattaneo - LIUC, στο Μιλάνο, είναι ένα σύγχρονο ίδρυμα που ειδικεύεται στις επιχειρηματικές σπουδές και την τεχνολογία. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, ενσωματώνοντας σύγχρονες εκπαιδευτικές μεθόδους."
        ));
        universityInfoMap.put("Universita degli Studi di Firenze", new UniversityInfo(
            "Φλωρεντία, Ιταλία",
            "Το Universita degli Studi di Firenze, στη Φλωρεντία, έχει μακρά παράδοση στην τέχνη, την ιστορία και τις ανθρωπιστικές σπουδές. Συνδυάζει την κλασική ιταλική παράδοση με σύγχρονες μεθόδους διδασκαλίας και εφαρμοσμένη έρευνα, προωθώντας την καινοτομία."
        ));
        universityInfoMap.put("LUISS - Libera Universita Internazionale degli Studi Sociali - Guido Carli", new UniversityInfo(
            "Ρώμη, Ιταλία",
            "Η LUISS, στη Ρώμη, είναι διεθνώς αναγνωρισμένη για τα προγράμματά της στις κοινωνικές, διοικητικές και νομικές σπουδές. Συνδυάζει υψηλά ακαδημαϊκά πρότυπα με καινοτόμες μεθόδους διδασκαλίας και διεθνείς συνεργασίες, προωθώντας την έρευνα και την καινοτομία."
        ));
        universityInfoMap.put("University of Pisa", new UniversityInfo(
            "Πίζα, Ιταλία",
            "Το University of Pisa, στην Πίζα, είναι διεθνώς αναγνωρισμένο για τις φυσικές, μαθηματικές και τεχνολογικές σπουδές. Διαθέτει μακρά ιστορία και συνδυάζει παραδοσιακή γνώση με σύγχρονες μεθόδους διδασκαλίας και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Universita degli Studi di Roma \"Tor Vergata\"", new UniversityInfo(
            "Ρώμη, Ιταλία",
            "Το Universita degli Studi di Roma 'Tor Vergata', στη Ρώμη, συνδυάζει σύγχρονες εκπαιδευτικές μεθόδους με παραδοσιακή ακαδημαϊκή γνώση. Διακρίνεται για τα προγράμματά του στις επιστήμες και την τεχνολογία, προωθώντας διεθνείς συνεργασίες και καινοτομία."
        ));
        universityInfoMap.put("Universita degli Studi di Torino", new UniversityInfo(
            "Τόρινο, Ιταλία",
            "Το Universita degli Studi di Torino, στο Τόρινο, είναι γνωστό για τα προγράμματά του στις ανθρωπιστικές, νομικές και τεχνολογικές σπουδές. Διαθέτει πλούσια παράδοση και συνδυάζει παραδοσιακή γνώση με σύγχρονες μεθόδους διδασκαλίας και εφαρμοσμένη έρευνα."
        ));
        universityInfoMap.put("Libera Universita Maria Santissimaassunta (LUMSA)", new UniversityInfo(
            "Ρώμη, Ιταλία",
            "Το LUMSA, στη Ρώμη, είναι ένα σύγχρονο ίδρυμα που επικεντρώνεται στις κοινωνικές και επιχειρηματικές σπουδές. Συνδυάζει πρακτική διδασκαλία με θεμελιώδη ακαδημαϊκή γνώση, προωθώντας καινοτομία και διεθνείς συνεργασίες σε ένα δυναμικό εκπαιδευτικό περιβάλλον."
        ));

        // LATVIA
        universityInfoMap.put("Latvijas Universitate", new UniversityInfo(
            "Λιτόβη, Λετονία",
            "Το Latvijas Universitate, στο κέντρο της Λετονίας, είναι το κύριο πανεπιστήμιο της χώρας. Διακρίνεται για την ιστορική του παράδοση και τις σύγχρονες εκπαιδευτικές μεθόδους στις ανθρωπιστικές, φυσικές και κοινωνικές επιστήμες, προωθώντας διεθνείς συνεργασίες."
        ));

        // LITHUANIA
        universityInfoMap.put("Kaunas University of Technology", new UniversityInfo(
            "Καυνά, Λιθουανία",
            "Το Kaunas University of Technology, στη Λιθουανία, είναι γνωστό για την εφαρμοσμένη έρευνα και τις μηχανικές σπουδές του. Συνδυάζει σύγχρονες εκπαιδευτικές μεθόδους με πρακτική εφαρμογή, προωθώντας καινοτομία και διεθνείς συνεργασίες στον τεχνολογικό τομέα."
        ));
        universityInfoMap.put("Vytautas Magnus University", new UniversityInfo(
            "Καυνά, Λιθουανία",
            "Το Vytautas Magnus University, στη Λιθουανία, εξειδικεύεται στις ανθρωπιστικές και κοινωνικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τη συνδυαστική προσέγγιση που προάγει διεθνείς συνεργασίες και ακαδημαϊκή αριστεία."
        ));

        // NETHERLANDS
        universityInfoMap.put("Rotterdam School of Management - Erasmus University Rotterdam (Δέχεται μόνο φοιτητές που έχουν ολοκληρώσει το 3ο έτος σπουδών και έχουν 180 ECTS)", new UniversityInfo(
            "Ρότερνταμ, Ολλανδία",
            "Το RSM, μέλος του Erasmus University Rotterdam, βρίσκεται στη Ρότερνταμ και προσφέρει εξειδικευμένα προγράμματα στις επιχειρηματικές σπουδές. Εστιάζει στη σοβαρή έρευνα, τις διεθνείς συνεργασίες και τη δομή προγραμμάτων για φοιτητές με 180 ECTS."
        ));
        universityInfoMap.put("Vrije Universiteit Amsterdam", new UniversityInfo(
            "Άμστερνταμ, Ολλανδία",
            "Η Vrije Universiteit Amsterdam, στην Άμστερνταμ, έχει μακρά παράδοση στις ανθρωπιστικές, κοινωνικές και επιχειρηματικές σπουδές. Διακρίνεται για την καινοτομία, την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες, ενσωματώνοντας σύγχρονες εκπαιδευτικές πρακτικές."
        ));

        // NORWAY
        universityInfoMap.put("BI - Norwegian Business School", new UniversityInfo(
            "Οσλο, Νορβηγία",
            "Το BI στην Οσλο, κορυφαίο ίδρυμα επιχειρηματικών σπουδών στη Νορβηγία, προσφέρει εξειδικευμένα προγράμματα στις οικονομικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις καινοτόμες εκπαιδευτικές μεθόδους."
        ));
        universityInfoMap.put("Norwegian School of Economics - NHH", new UniversityInfo(
            "Οσλο, Νορβηγία",
            "Το NHH, στην Οσλο, είναι ένα από τα κορυφαία πανεπιστήμια οικονομικών στη Νορβηγία. Προσφέρει ισχυρά προγράμματα, έμφαση στην έρευνα και διεθνείς συνεργασίες, συνδυάζοντας παραδοσιακή ακαδημαϊκή γνώση με σύγχρονες μεθόδους διδασκαλίας."
        ));

        // POLAND
        universityInfoMap.put("Cracow University of Economics", new UniversityInfo(
            "Κράκοβ, Πολωνία",
            "Το Cracow University of Economics, στην Κράκοβ, είναι γνωστό για τα δυναμικά του προγράμματα στις οικονομικές σπουδές. Συνδυάζει υψηλά ακαδημαϊκά πρότυπα με εφαρμοσμένη έρευνα και διεθνείς συνεργασίες, προωθώντας την καινοτομία στον οικονομικό τομέα."
        ));
        universityInfoMap.put("Gdansk University of Technology / Politechnika Gdanska", new UniversityInfo(
            "Γκντάνσκ, Πολωνία",
            "Το Gdansk University of Technology, γνωστό και ως Politechnika Gdanska, βρίσκεται στη Γκντάνσκ και εξειδικεύεται στις μηχανικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τη στενή συνεργασία με την τοπική βιομηχανία."
        ));
        universityInfoMap.put("University of Gdansk - Faculty of Economics", new UniversityInfo(
            "Γκντάνσκ, Πολωνία",
            "Το University of Gdansk, στην Γκντάνσκ, διαθέτει ισχυρό τμήμα οικονομικών. Συνδυάζει παραδοσιακή γνώση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες, προωθώντας την καινοτομία στον τομέα των οικονομικών σπουδών."
        ));
        universityInfoMap.put("Warsaw School of Economics - SGH", new UniversityInfo(
            "Βαρσοβία, Πολωνία",
            "Το Warsaw School of Economics (SGH) στη Βαρσοβία είναι κορυφαίο ίδρυμα οικονομικών, γνωστό για την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες. Διακρίνεται για τις καινοτόμες εκπαιδευτικές του προσεγγίσεις και τα υψηλά ακαδημαϊκά πρότυπα."
        ));

        // PORTUGAL
        universityInfoMap.put("Lisboa School of Economics & Management - Universidade de Lisboa (ISEG-ULisboa)", new UniversityInfo(
            "Λισαβόνα, Πορτογαλία",
            "Το ISEG-ULisboa στη Λισαβόνα είναι διεθνώς αναγνωρισμένο για τα προγράμματά του στις οικονομικές και επιχειρηματικές σπουδές. Συνδυάζει υψηλά πρότυπα έρευνας με σύγχρονες εκπαιδευτικές μεθόδους και διεθνείς συνεργασίες, προωθώντας την καινοτομία."
        ));
        universityInfoMap.put("Universidade do Minho", new UniversityInfo(
            "Μίνιο, Πορτογαλία",
            "Το Universidade do Minho, στο Μίνιο της Πορτογαλίας, προσφέρει δυναμικά προγράμματα στις τεχνολογικές και επιχειρηματικές σπουδές. Διακρίνεται για την έμφαση στην εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Instituto Politecnico de Leiria", new UniversityInfo(
            "Λείρια, Πορτογαλία",
            "Το Instituto Politecnico de Leiria, στην Πορτογαλία, εξειδικεύεται στις εφαρμοσμένες τεχνολογικές σπουδές και τη διοίκηση επιχειρήσεων. Συνδυάζει πρακτική διδασκαλία με καινοτόμες μεθόδους έρευνας και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("University of Porto - FEP School of Economics and Management", new UniversityInfo(
            "Πόρτο, Πορτογαλία",
            "Το University of Porto - FEP, στο πόρτο της Πορτογαλίας, είναι γνωστό για τα προγράμματά του στις οικονομικές και επιχειρηματικές σπουδές. Συνδυάζει εφαρμοσμένη έρευνα, διεθνείς συνεργασίες και σύγχρονες εκπαιδευτικές μεθόδους σε ένα δυναμικό ακαδημαϊκό περιβάλλον."
        ));

        // ROMANIA
        universityInfoMap.put("Universitatea Babes - Bolyai", new UniversityInfo(
            "Κλαζόβε, Ρουμανία",
            "Το Universitatea Babes - Bolyai, στη Κλαζόβε, έχει μακρά ιστορία και προσφέρει ολοκληρωμένα προγράμματα στις ανθρωπιστικές και φυσικές σπουδές. Διακρίνεται για την έρευνα, τις διεθνείς συνεργασίες και την εφαρμογή σύγχρονων μεθόδων διδασκαλίας."
        ));
        universityInfoMap.put("Alexandru Ioan Cuza - University of Iasi", new UniversityInfo(
            "Ιάσι, Ρουμανία",
            "Το University of Iasi, στην Ιάσι, προσφέρει ολοκληρωμένα προγράμματα στις κοινωνικές και ανθρωπιστικές σπουδές. Διακρίνεται για την ιστορική του παράδοση, την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες που προάγουν την καινοτομία."
        ));
        universityInfoMap.put("Academia de Studii Economice din Bucuresti (ASE)", new UniversityInfo(
            "Βουκουρέστι, Ρουμανία",
            "Η ASE στη Βουκουρέστι είναι το κορυφαίο ίδρυμα οικονομικών της Ρουμανίας, με έμφαση στις οικονομικές και διοικητικές σπουδές. Συνδυάζει υψηλά πρότυπα έρευνας με διεθνείς συνεργασίες και σύγχρονες μεθόδους διδασκαλίας."
        ));
        universityInfoMap.put("West University of Timisoara", new UniversityInfo(
            "Τιμίσοαρα, Ρουμανία",
            "Το West University of Timisoara, στην Τιμίσοαρα, προσφέρει ποιοτικά προγράμματα σε διάφορους τομείς. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και την καινοτομία, συνδυάζοντας παραδοσιακή ακαδημαϊκή γνώση με σύγχρονες εκπαιδευτικές πρακτικές."
        ));

        // SLOVAKIA
        universityInfoMap.put("Comenius University in Bratislava", new UniversityInfo(
            "Μπρατισλάβα, Σλοβακία",
            "Το Comenius University in Bratislava, το μεγαλύτερο ίδρυμα στη Σλοβακία, βρίσκεται στη Μπρατισλάβα. Διαθέτει μακρά ιστορία, προσφέρει ολοκληρωμένα προγράμματα στις ανθρωπιστικές, φυσικές και κοινωνικές επιστήμες και προωθεί διεθνείς συνεργασίες."
        ));

        // SLOVENIA
        universityInfoMap.put("University of Maribor", new UniversityInfo(
            "Μαρίμπορ, Σλοβενία",
            "Το University of Maribor, το δεύτερο μεγαλύτερο πανεπιστήμιο στη Σλοβενία, βρίσκεται στη Μαρίμπορ. Προσφέρει δυναμικά προγράμματα στις τεχνολογικές και ανθρωπιστικές σπουδές, συνδυάζοντας εφαρμοσμένη έρευνα, καινοτομία και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("University of Primorska", new UniversityInfo(
            "Κοπελίνα, Σλοβενία",
            "Το University of Primorska, στην περιοχή Κοπελίνας, είναι γνωστό για τα πρωτοποριακά του προγράμματα στις περιβαλλοντικές και κοινωνικές επιστήμες. Συνδυάζει τοπική παράδοση με σύγχρονες εκπαιδευτικές μεθόδους και διεθνείς συνεργασίες, προωθώντας την καινοτομία."
        ));

        // SPAIN
        universityInfoMap.put("Universidad de Alcala", new UniversityInfo(
            "Άλκαλα, Ισπανία",
            "Το Universidad de Alcala, στην Ισπανία, έχει μακρά ιστορία και προσφέρει ολοκληρωμένα προγράμματα στις κοινωνικές και ανθρωπιστικές σπουδές. Συνδυάζει παραδοσιακή γνώση με σύγχρονες μεθόδους διδασκαλίας και διεθνείς συνεργασίες, προωθώντας την έρευνα και την καινοτομία."
        ));
        universityInfoMap.put("University of Barcelona", new UniversityInfo(
            "Βαρκελώνη, Ισπανία",
            "Το University of Barcelona, στην καρδιά της Βαρκελώνης, είναι ένα από τα κορυφαία πανεπιστήμια της Ισπανίας. Διαθέτει ισχυρά προγράμματα στις ανθρωπιστικές, κοινωνικές και επιστημονικές σπουδές, ενσωματώνοντας σύγχρονες μεθόδους και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("University of Deusto", new UniversityInfo(
            "Μπιλμπάο, Ισπανία",
            "Το University of Deusto, στο Μπιλμπάο της Ισπανίας, είναι γνωστό για τα προγράμματά του στις ανθρωπιστικές και νομικές σπουδές. Συνδυάζει παραδοσιακή ακαδημαϊκή γνώση με σύγχρονες μεθόδους διδασκαλίας και διεθνείς συνεργασίες, προωθώντας την καινοτομία."
        ));
        universityInfoMap.put("University of Granada", new UniversityInfo(
            "Γρανάδα, Ισπανία",
            "Το University of Granada, στην Ισπανία, διακρίνεται για τα προγράμματά του στις τέχνες, επιστήμες και ανθρωπιστικές σπουδές. Έχει μακρά ιστορία και προωθεί τη διεθνή έρευνα, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες εκπαιδευτικές μεθόδους."
        ));
        universityInfoMap.put("Universidad Publica de Navarra", new UniversityInfo(
            "Ναβάρα, Ισπανία",
            "Το Universidad Publica de Navarra, στη Ναβάρα, προσφέρει ποιοτικά προγράμματα στις κοινωνικές και ανθρωπιστικές σπουδές. Συνδυάζει ιστορική παράδοση με σύγχρονες μεθόδους διδασκαλίας και διεθνείς συνεργασίες, προωθώντας την έρευνα και την καινοτομία."
        ));
        universityInfoMap.put("Universidad Rey Juan Carlos", new UniversityInfo(
            "Μαδρίτη, Ισπανία",
            "Το Universidad Rey Juan Carlos, στη Μαδρίτη, είναι γνωστό για τα δυναμικά του προγράμματα στις κοινωνικές και επιχειρηματικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις καινοτόμες εκπαιδευτικές μεθόδους, προωθώντας την ακαδημαϊκή αριστεία."
        ));
        universityInfoMap.put("Universitat Rovira I Virgili", new UniversityInfo(
            "Τεμπέλ, Ισπανία",
            "Το Universitat Rovira I Virgili, στην πόλη Τεμπέλ, προσφέρει προγράμματα στις ανθρωπιστικές και κοινωνικές σπουδές. Διακρίνεται για τη διεθνή έρευνα, τις συνεργασίες και τη σύγχρονη εκπαιδευτική του προσέγγιση, συνδυάζοντας παραδοσιακή γνώση με καινοτομία."
        ));
        universityInfoMap.put("Universitat de Valencia", new UniversityInfo(
            "Βαλένθια, Ισπανία",
            "Το Universitat de Valencia, στη Βαλένθια, είναι γνωστό για τα προγράμματά του στις επιστήμες, τις τέχνες και τις κοινωνικές σπουδές. Συνδυάζει ιστορική παράδοση με σύγχρονες εκπαιδευτικές μεθόδους και διεθνείς συνεργασίες, προωθώντας την έρευνα και την καινοτομία."
        ));
        universityInfoMap.put("Universidad Zaragoza", new UniversityInfo(
            "Ζαράγκουα, Ισπανία",
            "Το Universidad Zaragoza, στη Ζαράγκουα, προσφέρει ολοκληρωμένα προγράμματα στις κοινωνικές, ανθρωπιστικές και τεχνολογικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες μεθόδους διδασκαλίας, προωθώντας την καινοτομία."
        ));
        universityInfoMap.put("University of Salamanca", new UniversityInfo(
            "Σαλαμάνκα, Ισπανία",
            "Το University of Salamanca, ένα από τα παλαιότερα πανεπιστήμια της Ισπανίας, διακρίνεται για τα ισχυρά του προγράμματα στις ανθρωπιστικές και κοινωνικές σπουδές. Συνδυάζει ιστορική παράδοση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Universitat Autonoma de Barcelona", new UniversityInfo(
            "Βαρκελώνη, Ισπανία",
            "Το Universitat Autonoma de Barcelona, στην Βαρκελώνη, είναι γνωστό για την έμφαση στην έρευνα και τις κοινωνικές επιστήμες. Διακρίνεται για τη διεθνή συνεργασία, τις καινοτόμες εκπαιδευτικές μεθόδους και τη συνδυαστική του προσέγγιση που ενσωματώνει ιστορική παράδοση με σύγχρονη γνώση."
        ));
        universityInfoMap.put("Universidad de Alicante", new UniversityInfo(
            "Αλικάντε, Ισπανία",
            "Το Universidad de Alicante, στην Αλικάντε, προσφέρει προγράμματα στις επιστήμες και τις τεχνολογικές σπουδές. Διακρίνεται για τις σύγχρονες εκπαιδευτικές μεθόδους, την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες που προάγουν την καινοτομία στον ακαδημαϊκό χώρο."
        ));
        universityInfoMap.put("University of the Basque Country", new UniversityInfo(
            "Περιοχή Βασκίας, Ισπανία",
            "Το University of the Basque Country, στην περιοχή της Βασκίας, είναι γνωστό για τα προγράμματά του στις κοινωνικές και ανθρωπιστικές σπουδές. Διαθέτει ισχυρή ακαδημαϊκή παράδοση, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες μεθόδους διδασκαλίας και διεθνείς συνεργασίες."
        ));

        // SWEDEN
        universityInfoMap.put("University of Gothenburg", new UniversityInfo(
            "Γκότναμπουργκ, Σουηδία",
            "Το University of Gothenburg, στη Σουηδία, είναι διεθνώς αναγνωρισμένο για τα προγράμματά του στις κοινωνικές, επιστημονικές και ανθρωπιστικές σπουδές. Διαθέτει ισχυρή έρευνα, συνδυάζει παραδοσιακή γνώση με σύγχρονες μεθόδους και προωθεί διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Umea University", new UniversityInfo(
            "Ουμέα, Σουηδία",
            "Το Umea University, στην πόλη Ουμέα της Σουηδίας, προσφέρει προγράμματα στις τεχνολογικές, επιστημονικές και κοινωνικές σπουδές. Διακρίνεται για τις καινοτόμες εκπαιδευτικές μεθόδους, την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες που ενισχύουν την ακαδημαϊκή του αριστεία."
        ));

        // SWITZERLAND
        universityInfoMap.put("Universite de Lausanne (HEC)", new UniversityInfo(
            "Λωζάνη, Ελβετία",
            "Το Universite de Lausanne (HEC) στη Λωζάνη, Ελβετία, είναι διεθνώς αναγνωρισμένο για τα προγράμματά του στις επιχειρηματικές και οικονομικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και την καινοτομία, συνδυάζοντας ιστορική παράδοση με σύγχρονες μεθόδους διδασκαλίας."
        ));
        universityInfoMap.put("Haute Ecole de Gestion de Geneve (HEG)", new UniversityInfo(
            "Γενεύη, Ελβετία",
            "Το HEG στη Γενεύη της Ελβετίας προσφέρει εξειδικευμένα προγράμματα στις διοικητικές σπουδές και το management. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, συνδυάζοντας παραδοσιακές αξίες με σύγχρονες εκπαιδευτικές πρακτικές."
        ));

        // TURKEY
        universityInfoMap.put("Bahcesehir University", new UniversityInfo(
            "Ιστανμπούλ, Τουρκία",
            "Το Bahcesehir University, στην Ιστανμπούλ, είναι ένα σύγχρονο ίδρυμα με έμφαση στις τεχνολογικές και επιχειρηματικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις καινοτόμες μεθόδους διδασκαλίας που προωθούν την ακαδημαϊκή αριστεία."
        ));
        universityInfoMap.put("Izmir University of Economics", new UniversityInfo(
            "Ίζμιρ, Τουρκία",
            "Το Izmir University of Economics, στην Ίζμιρ, εξειδικεύεται στις επιχειρηματικές και οικονομικές σπουδές. Συνδυάζει ιστορική παράδοση με σύγχρονες μεθόδους διδασκαλίας, προωθώντας διεθνείς συνεργασίες και εφαρμοσμένη έρευνα σε ένα δυναμικό εκπαιδευτικό περιβάλλον."
        ));
        universityInfoMap.put("Pamukkale University", new UniversityInfo(
            "Pamukkale, Τουρκία",
            "Το Pamukkale University, στην περιοχή Pamukkale, προσφέρει ποιοτικά προγράμματα στις τεχνολογικές και ανθρωπιστικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, συνδυάζοντας ιστορικές αξίες με σύγχρονες εκπαιδευτικές πρακτικές."
        ));
        universityInfoMap.put("Istanbul Teknik Universitesi", new UniversityInfo(
            "Ιστανμπούλ, Τουρκία",
            "Το Istanbul Teknik Universitesi, στην Ιστανμπούλ, είναι ένα από τα κορυφαία τεχνολογικά ιδρύματα της Τουρκίας. Διακρίνεται για τα προγράμματά του στις μηχανικές και τεχνολογικές σπουδές, ενσωματώνοντας εφαρμοσμένη έρευνα, καινοτομία και διεθνείς συνεργασίες."
        ));

        // UNITED_KINGDOM
        universityInfoMap.put("The University of Northumbria at Newcastle", new UniversityInfo(
            "Newcastle, Ηνωμένο Βασίλειο",
            "Το The University of Northumbria at Newcastle, στο Newcastle, είναι γνωστό για τα προγράμματά του στις επιχειρηματικές, τεχνολογικές και ανθρωπιστικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες εκπαιδευτικές μεθόδους που προωθούν την καινοτομία."
        ));
                // AUSTRIA
                universityInfoMap.put("WU - Vienna University of Economics & Business", new UniversityInfo(
                    "Βιέννη, Αυστρία",
                    "Το WU, ιδρυμένο το 1898 στη Βιέννη, προσφέρει εξειδικευμένα προγράμματα στις οικονομικές και επιχειρηματικές σπουδές. Διακρίνεται για την έρευνα, τις διεθνείς συνεργασίες και την καινοτόμο προσέγγιση, συνδυάζοντας την ιστορική παράδοση της πόλης με σύγχρονες εκπαιδευτικές μεθόδους."
                ));
        
                // BELGIUM
                universityInfoMap.put("Universiteit Antwerpen", new UniversityInfo(
                    "Antwerpen, Βέλγιο",
                    "Το Universiteit Antwerpen βρίσκεται στην πόλη Antwerpen και έχει μακρά ακαδημαϊκή παράδοση. Προσφέρει ολοκληρωμένα προγράμματα στις κοινωνικές και επιχειρηματικές σπουδές, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες ερευνητικές μεθόδους και διεθνείς συνεργασίες."
                ));
                universityInfoMap.put("Universite Catholique de Louvain (UCL) - Louvain School of Management", new UniversityInfo(
                    "Λούβεν, Βέλγιο",
                    "Η Louvain School of Management στο UCL, στη Λούβεν, είναι διεθνώς αναγνωρισμένη για τα προγράμματά της στις επιχειρηματικές σπουδές. Συνδυάζει παραδοσιακές αξίες με σύγχρονες ερευνητικές μεθόδους και διεθνείς συνεργασίες, προωθώντας την καινοτομία στον ακαδημαϊκό χώρο."
                ));
                universityInfoMap.put("KU Leuven-Faculty of Economics and Business", new UniversityInfo(
                    "Leuven, Βέλγιο",
                    "Η KU Leuven, με το τμήμα οικονομικών και επιχειρηματικών σπουδών, στη Leuven, έχει βαθιές ρίζες και προσφέρει προγράμματα υψηλής ποιότητας. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και την καινοτόμο προσέγγιση, συνδυάζοντας παράδοση και σύγχρονη εκπαίδευση."
                ));
        
                // CYPRUS
                universityInfoMap.put("University of Cyprus", new UniversityInfo(
                    "Λευκωσία, Κύπρος",
                    "Το University of Cyprus, στην Λευκωσία, είναι το κορυφαίο πανεπιστήμιο της χώρας. Προσφέρει ολοκληρωμένα προγράμματα στις επιστήμες, την τεχνολογία και τις ανθρωπιστικές σπουδές, συνδυάζοντας την ιστορική παράδοση της Κύπρου με σύγχρονες μεθόδους διδασκαλίας."
                ));
        
                // CZECH_REPUBLIK
                universityInfoMap.put("Mendel University in Brno", new UniversityInfo(
                    "Μπρνο, Τσεχία",
                    "Το Mendel University in Brno, στο Μπρνο, εξειδικεύεται στις γεωπονικές και τεχνολογικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, προσφέροντας σύγχρονα προγράμματα που ενσωματώνουν παραδοσιακή ακαδημαϊκή γνώση με νέες μεθόδους."
                ));
        
                // DENMARK
                universityInfoMap.put("University of Copenhagen", new UniversityInfo(
                    "Κοπεγχάγη, Δανία",
                    "Το University of Copenhagen, ένα από τα παλαιότερα πανεπιστήμια της Δανίας, βρίσκεται στην πρωτεύουσα. Διαθέτει ισχυρά προγράμματα στις επιστήμες και τις ανθρωπιστικές σπουδές, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες."
                ));
        
                // FRANCE
                universityInfoMap.put("Université Catholique de Lille", new UniversityInfo(
                    "Λίλ, Γαλλία",
                    "Το Université Catholique de Lille, στη Λίλ, έχει μακρά ιστορία και προσφέρει ποιοτικά προγράμματα στις κοινωνικές και ανθρωπιστικές σπουδές. Διακρίνεται για τις εφαρμοσμένες μεθόδους διδασκαλίας, την έρευνα και τις διεθνείς συνεργασίες, προωθώντας την καινοτομία."
                ));
                universityInfoMap.put("Université Paris 1 Pantheon-Sorbonne", new UniversityInfo(
                    "Παρίσι, Γαλλία",
                    "Το Université Paris 1 Pantheon-Sorbonne, στην καρδιά του Παρισιού, είναι γνωστό για τις ανθρωπιστικές και κοινωνικές σπουδές. Συνδυάζει ιστορική παράδοση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες, προσφέροντας υψηλά ακαδημαϊκά πρότυπα."
                ));
                universityInfoMap.put("Ecole de Management Strasbourg (EM Strasbourg Business School)", new UniversityInfo(
                    "Στρασβούργο, Γαλλία",
                    "Η EM Strasbourg Business School, στο Στρασβούργο, εξειδικεύεται στις επιχειρηματικές σπουδές και το management. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, συνδυάζοντας τοπική παράδοση με σύγχρονες εκπαιδευτικές πρακτικές."
                ));
                universityInfoMap.put("Universite de Rennes 1", new UniversityInfo(
                    "Ρεν, Γαλλία",
                    "Το Universite de Rennes 1, στη Ρεν, είναι ένα σύγχρονο ίδρυμα με έμφαση στις επιστήμες και τις κοινωνικές σπουδές. Διακρίνεται για την έρευνα, τις διεθνείς συνεργασίες και την εφαρμογή σύγχρονων εκπαιδευτικών μεθόδων, προωθώντας την καινοτομία."
                ));
        
                // GERMANY
                universityInfoMap.put("Freie Universität Berlin", new UniversityInfo(
                    "Βερολίνο, Γερμανία",
                    "Η Freie Universität Berlin, στη Βερολίνο, είναι ένα από τα κορυφαία πανεπιστήμια της Γερμανίας. Διαθέτει ισχυρά προγράμματα στις ανθρωπιστικές, κοινωνικές και οικονομικές σπουδές, συνδυάζοντας ιστορική παράδοση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες."
                ));
                universityInfoMap.put("Technische Universität Dresden", new UniversityInfo(
                    "Δρέσδη, Γερμανία",
                    "Το Technische Universität Dresden, στη Δρέσδη, είναι γνωστό για τα προγράμματά του στις τεχνολογικές και μηχανικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, προσφέροντας σύγχρονα εκπαιδευτικά προγράμματα."
                ));
                universityInfoMap.put("Eberhard Karls Universitat Tubingen", new UniversityInfo(
                    "Τουμπίνγκεν, Γερμανία",
                    "Το Eberhard Karls Universitat Tubingen, στο Τουμπίνγκεν, έχει μακρά παράδοση στις ανθρωπιστικές και φυσικές σπουδές. Συνδυάζει παραδοσιακή ακαδημαϊκή γνώση με σύγχρονες ερευνητικές μεθόδους και διεθνείς συνεργασίες, προωθώντας την καινοτομία."
                ));
                universityInfoMap.put("Johan Wolfang Goethe Universitat", new UniversityInfo(
                    "Φραγκφούρτη, Γερμανία",
                    "Η Johan Wolfang Goethe Universität, στο Φραγκφούρτη, είναι ένα από τα πιο διακεκριμένα πανεπιστήμια της Γερμανίας. Διακρίνεται για τα προγράμματά του στις οικονομικές, κοινωνικές και ανθρωπιστικές σπουδές, με έμφαση στην εφαρμοσμένη έρευνα και διεθνείς συνεργασίες."
                ));
        
                // IRELAND
                universityInfoMap.put("University College Dublin", new UniversityInfo(
                    "Δουβλίνο, Ιρλανδία",
                    "Το University College Dublin, στο Δουβλίνο, είναι το κορυφαίο ίδρυμα της Ιρλανδίας στις κοινωνικές και τεχνολογικές σπουδές. Διαθέτει δυναμικά προγράμματα, έμφαση στην εφαρμοσμένη έρευνα και διεθνείς συνεργασίες, συνδυάζοντας παράδοση και καινοτομία."
                ));
        
                // ITALY
                universityInfoMap.put("Universita degli Studi di Roma \"Tor Vergata\"", new UniversityInfo(
                    "Ρώμη, Ιταλία",
                    "Το Universita degli Studi di Roma 'Tor Vergata', στη Ρώμη, είναι γνωστό για τα προγράμματά του στις επιστήμες και τεχνολογικές σπουδές. Διακρίνεται για την ιστορική του παράδοση, την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες, προσφέροντας σύγχρονες μεθόδους διδασκαλίας."
                ));
                universityInfoMap.put("Universita degli Studi di Catania", new UniversityInfo(
                    "Κατάνια, Ιταλία",
                    "Το Universita degli Studi di Catania, στην Κατάνια, έχει μακρά ιστορία και είναι γνωστό για τις τεχνολογικές και ανθρωπιστικές σπουδές. Συνδυάζει παραδοσιακή ιταλική εκπαίδευση με σύγχρονες μεθόδους έρευνας, προωθώντας την καινοτομία."
                ));
                universityInfoMap.put("Universita degli Studi di Firenze", new UniversityInfo(
                    "Φλωρεντία, Ιταλία",
                    "Το Universita degli Studi di Firenze, στη Φλωρεντία, είναι διάσημο για την τέχνη, την ιστορία και τις ανθρωπιστικές σπουδές. Συνδυάζει την παραδοσιακή ιταλική ακαδημαϊκή παράδοση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες."
                ));
        
                // NETHERLANDS
                universityInfoMap.put("University of Amsterdam", new UniversityInfo(
                    "Άμστερνταμ, Ολλανδία",
                    "Το University of Amsterdam, στην Άμστερνταμ, προσφέρει ολοκληρωμένα προγράμματα στις ανθρωπιστικές, κοινωνικές και επιχειρηματικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες εκπαιδευτικές μεθόδους, προωθώντας την καινοτομία."
                ));
                universityInfoMap.put("Erasmus School of Economics - Erasmus University Rotterdam", new UniversityInfo(
                    "Ρότερνταμ, Ολλανδία",
                    "Το Erasmus School of Economics, μέλος του Erasmus University Rotterdam, εξειδικεύεται στις επιχειρηματικές σπουδές. Διακρίνεται για τη διεθνή του έρευνα, τις εφαρμοσμένες εκπαιδευτικές μεθόδους και τις συνεργασίες, προσφέροντας ένα δυναμικό ακαδημαϊκό περιβάλλον."
                ));
                universityInfoMap.put("Vrije Universiteit Amsterdam", new UniversityInfo(
                    "Άμστερνταμ, Ολλανδία",
                    "Η Vrije Universiteit Amsterdam, στην Άμστερνταμ, έχει μακρά ιστορία και προσφέρει προγράμματα στις κοινωνικές, ανθρωπιστικές και επιχειρηματικές σπουδές. Συνδυάζει παραδοσιακή γνώση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες, προωθώντας την καινοτομία."
                ));
                universityInfoMap.put("University of Groningen", new UniversityInfo(
                    "Γκρόνινγκεν, Ολλανδία",
                    "Το University of Groningen, ένα από τα παλαιότερα πανεπιστήμια της Ολλανδίας, βρίσκεται στη Γκρόνινγκεν. Διαθέτει ισχυρά προγράμματα στις επιστήμες, τις κοινωνικές και ανθρωπιστικές σπουδές, προωθώντας διεθνείς συνεργασίες και καινοτόμες μεθόδους διδασκαλίας."
                ));
        
                // PORTUGAL
                universityInfoMap.put("Catolica Lisbon School of Business & Economics-Universidade Catolica Portuguesa", new UniversityInfo(
                    "Λισαβόνα, Πορτογαλία",
                    "Το Catolica Lisbon School of Business & Economics, στη Λισαβόνα, προσφέρει εξειδικευμένα προγράμματα στις οικονομικές και επιχειρηματικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες εκπαιδευτικές πρακτικές, συνδυάζοντας τοπική παράδοση με καινοτομία."
                ));
                universityInfoMap.put("Universidade de Coimbra", new UniversityInfo(
                    "Coimbra, Πορτογαλία",
                    "Το Universidade de Coimbra, στην ιστορική πόλη Coimbra, είναι ένα από τα παλαιότερα πανεπιστήμια της Πορτογαλίας. Διαθέτει ολοκληρωμένα προγράμματα στις ανθρωπιστικές και φυσικές σπουδές, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες μεθόδους έρευνας."
                ));
                universityInfoMap.put("University of Porto - FEP School of Economics and Management", new UniversityInfo(
                    "Πόρτο, Πορτογαλία",
                    "Το University of Porto - FEP, στο πόρτο, είναι διεθνώς αναγνωρισμένο για τα προγράμματά του στις οικονομικές σπουδές και το management. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες εκπαιδευτικές μεθόδους σε ένα δυναμικό ακαδημαϊκό περιβάλλον."
                ));
        
                // SLOVENIA
                universityInfoMap.put("University of Maribor", new UniversityInfo(
                    "Μαρίμπορ, Σλοβενία",
                    "Το University of Maribor, το δεύτερο μεγαλύτερο πανεπιστήμιο στη Σλοβενία, βρίσκεται στη Μαρίμπορ. Προσφέρει ολοκληρωμένα προγράμματα στις τεχνολογικές και ανθρωπιστικές σπουδές, ενσωματώνοντας εφαρμοσμένη έρευνα, καινοτομία και διεθνείς συνεργασίες."
                ));
        
                // SPAIN
                universityInfoMap.put("Universitat de Valencia", new UniversityInfo(
                    "Βαλένθια, Ισπανία",
                    "Το Universitat de Valencia, στη Βαλένθια, είναι ένα ιστορικό ίδρυμα με ολοκληρωμένα προγράμματα στις επιστήμες και κοινωνικές σπουδές. Διακρίνεται για την έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες εκπαιδευτικές πρακτικές, συνδυάζοντας παράδοση με καινοτομία."
                ));
                universityInfoMap.put("Universitat Autonoma de Barcelona", new UniversityInfo(
                    "Βαρκελώνη, Ισπανία",
                    "Το Universitat Autonoma de Barcelona, στην Βαρκελώνη, έχει μακρά ιστορία και προσφέρει δυναμικά προγράμματα στις κοινωνικές και ανθρωπιστικές σπουδές. Συνδυάζει παραδοσιακή γνώση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες, προωθώντας την καινοτομία."
                ));
                universityInfoMap.put("Universidade de Alicante", new UniversityInfo(
                    "Αλικάντε, Ισπανία",
                    "Το Universidade de Alicante, στην Αλικάντε, είναι γνωστό για τα ολοκληρωμένα προγράμματά του στις επιστήμες και τεχνολογικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες εκπαιδευτικές μεθόδους, προωθώντας την καινοτομία."
                ));
        
                // SWEDEN
                universityInfoMap.put("University of Gothenburg", new UniversityInfo(
                    "Γκότναμπουργκ, Σουηδία",
                    "Το University of Gothenburg, στη Σουηδία, είναι διεθνώς αναγνωρισμένο για τα προγράμματά του στις κοινωνικές, επιστημονικές και ανθρωπιστικές σπουδές. Διαθέτει ισχυρά ερευνητικά προγράμματα και συνδυάζει παραδοσιακή γνώση με σύγχρονες μεθόδους διδασκαλίας και διεθνείς συνεργασίες."
                ));
                        // AUSTRIA
        universityInfoMap.put("WU - Vienna University of Economics & Business", new UniversityInfo(
            "Βιέννη, Αυστρία",
            "Το WU στη Βιέννη, ιδρυμένο το 1898, προσφέρει εξειδικευμένα προγράμματα στις οικονομικές και επιχειρηματικές σπουδές. Διακρίνεται για την έρευνά του, τις διεθνείς συνεργασίες και την καινοτόμο προσέγγιση, συνδυάζοντας την ιστορική κληρονομιά της πόλης με σύγχρονες εκπαιδευτικές μεθόδους."
        ));

        // BELGIUM
        universityInfoMap.put("Universiteit Antwerpen (Προϋπόθεση: 120 ECTS)", new UniversityInfo(
            "Antwerpen, Βέλγιο",
            "Το Universiteit Antwerpen, που απαιτεί 120 ECTS, βρίσκεται στην Antwerpen και προσφέρει προγράμματα στις κοινωνικές και επιχειρηματικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, συνδυάζοντας παραδοσιακή ακαδημαϊκή γνώση με σύγχρονες εκπαιδευτικές πρακτικές."
        ));
        universityInfoMap.put("Universite Catholique de Louvain (UCL) - Louvain School of Management (campus Saint-Louis Bruxelles)", new UniversityInfo(
            "Bruxelles, Βέλγιο",
            "Η Louvain School of Management του UCL, στο campus Saint-Louis στις Βρυξέλλες, είναι διεθνώς αναγνωρισμένη για τα προγράμματά της στις επιχειρηματικές σπουδές. Συνδυάζει παραδοσιακή ακαδημαϊκή παράδοση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("KU Leuven-Faculty of Economics and Business (Antwerp - Brussels - Leuven Campus)", new UniversityInfo(
            "Leuven/Brussels, Βέλγιο",
            "Η KU Leuven, με πολλαπλά campus στην περιοχή Antwerpen, Brussels και Leuven, προσφέρει κορυφαία προγράμματα στις οικονομικές και επιχειρηματικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και την καινοτόμο προσέγγιση που συνδυάζει παράδοση και σύγχρονη εκπαίδευση."
        ));

        // CYPRUS
        universityInfoMap.put("University of Cyprus", new UniversityInfo(
            "Λευκωσία, Κύπρος",
            "Το University of Cyprus, στην Λευκωσία, αποτελεί το κορυφαίο ίδρυμα της χώρας. Προσφέρει ολοκληρωμένα προγράμματα στις επιστήμες και τεχνολογικές σπουδές, συνδυάζοντας ιστορική παράδοση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες."
        ));

        // CZECH_REPUBLIK
        universityInfoMap.put("Mendel University in Brno", new UniversityInfo(
            "Μπρνο, Τσεχία",
            "Το Mendel University in Brno, στο Μπρνο, εξειδικεύεται στις γεωπονικές και τεχνολογικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, παρέχοντας σύγχρονα προγράμματα σε ένα δυναμικό ακαδημαϊκό περιβάλλον."
        ));

        // DENMARK
        universityInfoMap.put("University of Copenhagen", new UniversityInfo(
            "Κοπεγχάγη, Δανία",
            "Το University of Copenhagen, στην πρωτεύουσα της Δανίας, είναι ένα ιστορικό ίδρυμα με δυναμικά προγράμματα στις επιστήμες και ανθρωπιστικές σπουδές. Συνδυάζει παραδοσιακή γνώση με σύγχρονες ερευνητικές μεθόδους και διεθνείς συνεργασίες."
        ));

        // FRANCE
        universityInfoMap.put("Université Catholique de Lille", new UniversityInfo(
            "Λίλ, Γαλλία",
            "Το Université Catholique de Lille, στη Λίλ, έχει μακρά ιστορία και προσφέρει προγράμματα στις κοινωνικές και ανθρωπιστικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και την καινοτομία, συνδυάζοντας ιστορική παράδοση με σύγχρονες μεθόδους διδασκαλίας."
        ));
        universityInfoMap.put("Université Paris 1 Pantheon-Sorbonne", new UniversityInfo(
            "Παρίσι, Γαλλία",
            "Το Université Paris 1 Pantheon-Sorbonne, στην καρδιά του Παρισιού, είναι γνωστό για τις ανθρωπιστικές και κοινωνικές σπουδές. Συνδυάζει ιστορική παράδοση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες, προσφέροντας υψηλά ακαδημαϊκά πρότυπα."
        ));
        universityInfoMap.put("Ecole de Management Strasbourg (EM Strasbourg Business School)", new UniversityInfo(
            "Στρασβούργο, Γαλλία",
            "Η EM Strasbourg, στο Στρασβούργο, προσφέρει εξειδικευμένα προγράμματα στις επιχειρηματικές σπουδές και το management. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τη σύγχρονη εκπαιδευτική της προσέγγιση, συνδυάζοντας παράδοση με καινοτομία."
        ));
        universityInfoMap.put("Universite de Rennes 1", new UniversityInfo(
            "Ρεν, Γαλλία",
            "Το Universite de Rennes 1, στη Ρεν, είναι ένα σύγχρονο ίδρυμα με έμφαση στις επιστήμες και τις κοινωνικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες μεθόδους διδασκαλίας, προωθώντας την καινοτομία."
        ));

        // GERMANY
        universityInfoMap.put("Freie Universität Berlin", new UniversityInfo(
            "Βερολίνο, Γερμανία",
            "Η Freie Universität Berlin στη Βερολίνο είναι ένα από τα κορυφαία πανεπιστήμια της Γερμανίας, γνωστό για τα προγράμματά της στις ανθρωπιστικές και κοινωνικές σπουδές. Διακρίνεται για την ιστορική της παράδοση και τις διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Technische Universität Dresden", new UniversityInfo(
            "Δρέσδη, Γερμανία",
            "Το Technische Universität Dresden, στη Δρέσδη, εξειδικεύεται στις τεχνολογικές και μηχανικές σπουδές. Συνδυάζει εφαρμοσμένη έρευνα, καινοτομία και διεθνείς συνεργασίες, προσφέροντας σύγχρονα προγράμματα σε ένα δυναμικό ακαδημαϊκό περιβάλλον."
        ));
        universityInfoMap.put("Eberhard Karls Universitat Tubingen", new UniversityInfo(
            "Τουμπίνγκεν, Γερμανία",
            "Το Eberhard Karls Universitat Tubingen, στο Τουμπίνγκεν, έχει μακρά παράδοση στις ανθρωπιστικές και φυσικές σπουδές. Συνδυάζει παραδοσιακή γνώση με σύγχρονες ερευνητικές μεθόδους και διεθνείς συνεργασίες, προωθώντας την καινοτομία στον ακαδημαϊκό χώρο."
        ));
        universityInfoMap.put("Johan Wolfang Goethe Universitat", new UniversityInfo(
            "Φραγκφούρτη, Γερμανία",
            "Η Johan Wolfang Goethe Universität, στο Φραγκφούρτη, είναι ένα από τα κορυφαία πανεπιστήμια της Γερμανίας με έμφαση στις οικονομικές και κοινωνικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τη σύγχρονη εκπαιδευτική προσέγγιση."
        ));

        // IRELAND
        universityInfoMap.put("University College Dublin", new UniversityInfo(
            "Δουβλίνο, Ιρλανδία",
            "Το University College Dublin, στο Δουβλίνο, είναι το κορυφαίο ίδρυμα της Ιρλανδίας στις κοινωνικές και τεχνολογικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες μεθόδους διδασκαλίας."
        ));

        // ITALY
        universityInfoMap.put("Universita degli Studi di Roma \"Tor Vergata\"", new UniversityInfo(
            "Ρώμη, Ιταλία",
            "Το Universita degli Studi di Roma 'Tor Vergata', στη Ρώμη, έχει μακρά παράδοση στις επιστήμες και τεχνολογικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες, συνδυάζοντας παραδοσιακή ιταλική ακαδημαϊκή παράδοση με σύγχρονες εκπαιδευτικές μεθόδους."
        ));
        universityInfoMap.put("Universita degli Studi di Catania", new UniversityInfo(
            "Κατάνια, Ιταλία",
            "Το Universita degli Studi di Catania, στην Κατάνια, έχει μακρά ιστορία και προσφέρει ολοκληρωμένα προγράμματα στις τεχνολογικές και ανθρωπιστικές σπουδές, συνδυάζοντας παραδοσιακή ιταλική εκπαίδευση με σύγχρονες μεθόδους έρευνας."
        ));
        universityInfoMap.put("Universita degli Studi di Firenze", new UniversityInfo(
            "Φλωρεντία, Ιταλία",
            "Το Universita degli Studi di Firenze, στη Φλωρεντία, είναι διάσημο για την τέχνη και τις ανθρωπιστικές σπουδές. Συνδυάζει την παραδοσιακή ιταλική κληρονομιά με σύγχρονες εκπαιδευτικές και ερευνητικές μεθόδους, προωθώντας την καινοτομία."
        ));

        // NETHERLANDS
        universityInfoMap.put("University of Amsterdam", new UniversityInfo(
            "Άμστερνταμ, Ολλανδία",
            "Το University of Amsterdam, στην Άμστερνταμ, προσφέρει ολοκληρωμένα προγράμματα στις κοινωνικές, επιχειρηματικές και ανθρωπιστικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες εκπαιδευτικές μεθόδους, προωθώντας την καινοτομία."
        ));
        universityInfoMap.put("Erasmus School of Economics - Erasmus University Rotterdam", new UniversityInfo(
            "Ρότερνταμ, Ολλανδία",
            "Το Erasmus School of Economics, μέρος του Erasmus University Rotterdam, εστιάζει στις επιχειρηματικές σπουδές και την οικονομία. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τη σύγχρονη εκπαιδευτική προσέγγιση, εξυπηρετώντας φοιτητές με υψηλά πρότυπα."
        ));
        universityInfoMap.put("Vrije Universiteit Amsterdam", new UniversityInfo(
            "Άμστερνταμ, Ολλανδία",
            "Η Vrije Universiteit Amsterdam, στην Άμστερνταμ, είναι γνωστή για τα προγράμματά της στις κοινωνικές, ανθρωπιστικές και επιχειρηματικές σπουδές. Συνδυάζει παραδοσιακή ακαδημαϊκή γνώση με σύγχρονες ερευνητικές μεθόδους και διεθνείς συνεργασίες, προωθώντας την καινοτομία."
        ));
        universityInfoMap.put("University of Groningen", new UniversityInfo(
            "Γκρόνινγκεν, Ολλανδία",
            "Το University of Groningen, ένα από τα παλαιότερα πανεπιστήμια της Ολλανδίας, βρίσκεται στη Γκρόνινγκεν. Διαθέτει ισχυρά προγράμματα στις επιστήμες, τις κοινωνικές και ανθρωπιστικές σπουδές, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες μεθόδους έρευνας."
        ));

        // PORTUGAL
        universityInfoMap.put("Catolica Lisbon School of Business & Economics-Universidade Catolica Portuguesa", new UniversityInfo(
            "Λισαβόνα, Πορτογαλία",
            "Το Catolica Lisbon School of Business & Economics, στη Λισαβόνα, προσφέρει εξειδικευμένα προγράμματα στις οικονομικές και επιχειρηματικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες εκπαιδευτικές πρακτικές, προωθώντας την καινοτομία."
        ));
        universityInfoMap.put("Universidade de Coimbra", new UniversityInfo(
            "Coimbra, Πορτογαλία",
            "Το Universidade de Coimbra, στην ιστορική πόλη Coimbra, είναι ένα από τα παλαιότερα πανεπιστήμια της Πορτογαλίας. Συνδυάζει παραδοσιακή ακαδημαϊκή γνώση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες, προωθώντας την έρευνα και την καινοτομία."
        ));
        universityInfoMap.put("University of Porto - FEP School of Economics and Management", new UniversityInfo(
            "Πόρτο, Πορτογαλία",
            "Το University of Porto - FEP, στο πόρτο, είναι διεθνώς αναγνωρισμένο για τα προγράμματά του στις οικονομικές σπουδές και το management. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες εκπαιδευτικές πρακτικές, προσφέροντας ένα δυναμικό ακαδημαϊκό περιβάλλον."
        ));

        // SLOVENIA
        universityInfoMap.put("University of Maribor", new UniversityInfo(
            "Μαρίμπορ, Σλοβενία",
            "Το University of Maribor, το δεύτερο μεγαλύτερο πανεπιστήμιο στη Σλοβενία, βρίσκεται στη Μαρίμπορ. Προσφέρει ολοκληρωμένα προγράμματα στις τεχνολογικές και ανθρωπιστικές σπουδές, προωθώντας εφαρμοσμένη έρευνα, καινοτομία και διεθνείς συνεργασίες."
        ));

        // SPAIN
        universityInfoMap.put("Universitat de Valencia", new UniversityInfo(
            "Βαλένθια, Ισπανία",
            "Το Universitat de Valencia, στη Βαλένθια, είναι ένα ιστορικό ίδρυμα με ολοκληρωμένα προγράμματα στις κοινωνικές, επιστημονικές και ανθρωπιστικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες εκπαιδευτικές μεθόδους."
        ));
        universityInfoMap.put("Universitat Autonoma de Barcelona", new UniversityInfo(
            "Βαρκελώνη, Ισπανία",
            "Το Universitat Autonoma de Barcelona, στην Βαρκελώνη, έχει μακρά ιστορία και προσφέρει δυναμικά προγράμματα στις κοινωνικές και ανθρωπιστικές σπουδές. Συνδυάζει παραδοσιακή γνώση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες, προωθώντας την καινοτομία."
        ));
        universityInfoMap.put("Universidade de Alicante", new UniversityInfo(
            "Αλικάντε, Ισπανία",
            "Το Universidade de Alicante, στην Αλικάντε, εξειδικεύεται στις επιστήμες και τεχνολογικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες εκπαιδευτικές πρακτικές, προωθώντας την καινοτομία στον ακαδημαϊκό χώρο."
        ));

        // SWEDEN
        universityInfoMap.put("University of Gothenburg", new UniversityInfo(
            "Γκότναμπουργκ, Σουηδία",
            "Το University of Gothenburg, στη Σουηδία, είναι διεθνώς αναγνωρισμένο για τα προγράμματά του στις κοινωνικές, επιστημονικές και ανθρωπιστικές σπουδές. Διαθέτει ισχυρά ερευνητικά προγράμματα, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες μεθόδους διδασκαλίας και διεθνείς συνεργασίες."
        ));
                // AUSTRIA
        universityInfoMap.put("Universität Wien", new UniversityInfo(
            "Βιέννη, Αυστρία",
            "Το Universität Wien, ιδρυμένο το 1365, είναι το μεγαλύτερο και παλαιότερο ίδρυμα της Αυστρίας. Είναι γνωστό για τα προγράμματά του στις ανθρωπιστικές, κοινωνικές και επιστήμες, με έμφαση στην έρευνα και τις διεθνείς συνεργασίες."
        ));

        // BELGIUM
        universityInfoMap.put("Hasselt University", new UniversityInfo(
            "Hasselt, Βέλγιο",
            "Το Hasselt University είναι ένα σύγχρονο ίδρυμα στο Βέλγιο, γνωστό για τα προγράμματά του στις τεχνολογικές και κοινωνικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, συνδυάζοντας παραδοσιακή ακαδημαϊκή γνώση με σύγχρονες μεθόδους."
        ));

        // CYPRUS
        universityInfoMap.put("University of Cyprus", new UniversityInfo(
            "Λευκωσία, Κύπρος",
            "Το University of Cyprus, στην Λευκωσία, είναι το κορυφαίο ίδρυμα της χώρας. Ιδρύθηκε το 1989 και προσφέρει ολοκληρωμένα προγράμματα στις επιστήμες, τις τεχνολογίες και τις ανθρωπιστικές σπουδές, με έμφαση στην έρευνα και τις διεθνείς συνεργασίες."
        ));

        // FRANCE
        universityInfoMap.put("Université Catholique de l’Ouest", new UniversityInfo(
            "Λίλ, Γαλλία",
            "Το Université Catholique de l’Ouest, στη Λίλ, έχει μακρά ιστορία και προσφέρει προγράμματα στις κοινωνικές και ανθρωπιστικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες, συνδυάζοντας παραδοσιακή παράδοση με σύγχρονες μεθόδους διδασκαλίας."
        ));
        universityInfoMap.put("UNIVERSITE D'ANGERS", new UniversityInfo(
            "Angers, Γαλλία",
            "Το UNIVERSITE D'ANGERS, στην πόλη Angers, διαθέτει μακρά ακαδημαϊκή παράδοση. Προσφέρει ολοκληρωμένα προγράμματα στις ανθρωπιστικές και φυσικές σπουδές, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Université de Nantes (IUT)", new UniversityInfo(
            "Νάντες, Γαλλία",
            "Το Université de Nantes μέσω του IUT, στη Νάντες, προσφέρει εφαρμοσμένα προγράμματα στις τεχνολογικές και επιστημονικές σπουδές. Διακρίνεται για την πρακτική του διδασκαλία, την έρευνα και τις διεθνείς συνεργασίες, προωθώντας την καινοτομία."
        ));

        // GERMANY
        universityInfoMap.put("Ludwig-Maximilians-Universität München", new UniversityInfo(
            "Μόναχο, Γερμανία",
            "Το Ludwig-Maximilians-Universität München, στο Μόναχο, είναι ένα από τα κορυφαία πανεπιστήμια της Γερμανίας με μακρά ιστορία. Διακρίνεται για τα προγράμματά του στις ανθρωπιστικές και κοινωνικές σπουδές, με έμφαση στην έρευνα και τις διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Technische Universität Dortmund", new UniversityInfo(
            "Ντόρτμουντ, Γερμανία",
            "Το Technische Universität Dortmund, στο Ντόρτμουντ, εξειδικεύεται στις μηχανικές και τεχνολογικές σπουδές. Είναι γνωστό για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, προσφέροντας σύγχρονα προγράμματα με πρακτικές εφαρμογές."
        ));
        universityInfoMap.put("Universität Bielefeld", new UniversityInfo(
            "Bielefeld, Γερμανία",
            "Το Universität Bielefeld, στη Bielefeld, είναι γνωστό για τα προγράμματά του στις κοινωνικές και ανθρωπιστικές σπουδές. Συνδυάζει παραδοσιακή ακαδημαϊκή γνώση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες, προωθώντας την καινοτομία."
        ));

        // IRELAND
        universityInfoMap.put("University College Dublin", new UniversityInfo(
            "Δουβλίνο, Ιρλανδία",
            "Το University College Dublin, στο Δουβλίνο, αποτελεί το κορυφαίο ίδρυμα της Ιρλανδίας για κοινωνικές και τεχνολογικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες εκπαιδευτικές μεθόδους, συνδυάζοντας παράδοση και καινοτομία."
        ));

        // ITALY
        universityInfoMap.put("Università di Bologna (Campus Bologna)", new UniversityInfo(
            "Bologna, Ιταλία",
            "Το Università di Bologna, στο campus της Bologna, είναι ένα από τα παλαιότερα πανεπιστήμια της Ιταλίας με βαθιές ρίζες. Προσφέρει ολοκληρωμένα προγράμματα στις ανθρωπιστικές και φυσικές σπουδές, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες μεθόδους έρευνας."
        ));
        universityInfoMap.put("Università degli Studi di Genova", new UniversityInfo(
            "Genova, Ιταλία",
            "Το Università degli Studi di Genova, στη Genova, έχει μακρά ιστορία και είναι γνωστό για τις τεχνολογικές και ανθρωπιστικές σπουδές. Διακρίνεται για την έρευνα, τις διεθνείς συνεργασίες και τη συνδυαστική προσέγγιση της παραδοσιακής και σύγχρονης εκπαίδευσης."
        ));
        universityInfoMap.put("Sapienza-Università di Roma", new UniversityInfo(
            "Ρώμη, Ιταλία",
            "Η Sapienza-Università di Roma, στην ιστορική Ρώμη, είναι ένα από τα μεγαλύτερα πανεπιστήμια της Ιταλίας. Διακρίνεται για τα δυναμικά προγράμματά της στις επιστήμες, τέχνες και ανθρωπιστικές σπουδές, με συνδυασμό παραδοσιακής κληρονομιάς και σύγχρονων εκπαιδευτικών μεθόδων."
        ));
        universityInfoMap.put("Università degli Studi di Pavia - University of Pavia", new UniversityInfo(
            "Pavia, Ιταλία",
            "Το Università degli Studi di Pavia, γνωστό και ως University of Pavia, στην Pavia, έχει μακρά ακαδημαϊκή παράδοση. Προσφέρει ολοκληρωμένα προγράμματα στις επιστήμες και ανθρωπιστικές σπουδές, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες."
        ));
        universityInfoMap.put("Università Cattolica del Sacro Cuore", new UniversityInfo(
            "Ρώμη, Ιταλία",
            "Το Università Cattolica del Sacro Cuore, στη Ρώμη, είναι διεθνώς αναγνωρισμένο ίδρυμα για κοινωνικές, ανθρωπιστικές και νομικές σπουδές. Διαθέτει ισχυρή ακαδημαϊκή παράδοση και προωθεί την έρευνα μέσω διεθνών συνεργασιών και σύγχρονων εκπαιδευτικών μεθόδων."
        ));
        universityInfoMap.put("Università degli Studi di Perugia", new UniversityInfo(
            "Perugia, Ιταλία",
            "Το Università degli Studi di Perugia, στην Perugia, έχει μακρά ιστορία και εξειδικεύεται στις ανθρωπιστικές και φυσικές σπουδές. Συνδυάζει παραδοσιακή ιταλική εκπαίδευση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες, προωθώντας την καινοτομία."
        ));
        universityInfoMap.put("Università degli Studi di Napoli Federico II", new UniversityInfo(
            "Napoli, Ιταλία",
            "Το Università degli Studi di Napoli Federico II, στη Napoli, είναι ένα από τα μεγαλύτερα πανεπιστήμια της Ιταλίας. Διακρίνεται για τα προγράμματά του στις τεχνολογικές και ανθρωπιστικές σπουδές, συνδυάζοντας ιστορική παράδοση με σύγχρονες μεθόδους διδασκαλίας και εφαρμοσμένη έρευνα."
        ));
        universityInfoMap.put("Università degli Studi di Trieste", new UniversityInfo(
            "Trieste, Ιταλία",
            "Το Università degli Studi di Trieste, στη Trieste, έχει σημαντική ακαδημαϊκή παράδοση και προσφέρει προγράμματα στις κοινωνικές και επιστήμες. Συνδυάζει παραδοσιακή γνώση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες, προωθώντας την καινοτομία."
        ));
        universityInfoMap.put("Politecnico di Milano (POLIMI)", new UniversityInfo(
            "Μιλάνο, Ιταλία",
            "Το Politecnico di Milano (POLIMI), στο Μιλάνο, είναι κορυφαίο τεχνολογικό ίδρυμα της Ιταλίας. Διακρίνεται για τα προγράμματά του στις μηχανικές και τεχνολογικές σπουδές, την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες, συνδυάζοντας ιστορική παράδοση με σύγχρονες εκπαιδευτικές μεθόδους."
        ));

        // LATVIA
        universityInfoMap.put("Latvijas Universitate", new UniversityInfo(
            "Λιτόβη, Λετονία",
            "Το Latvijas Universitate, στο κέντρο της Λετονίας, είναι το κύριο ίδρυμα της χώρας. Διακρίνεται για την ιστορική του παράδοση, τα προγράμματά του στις ανθρωπιστικές και κοινωνικές σπουδές και τις διεθνείς συνεργασίες, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες ερευνητικές μεθόδους."
        ));

        // NETHERLANDS
        universityInfoMap.put("Eindhoven University of Technology - School of Economics and Business", new UniversityInfo(
            "Eindhoven, Ολλανδία",
            "Το Eindhoven University of Technology, μέσω της School of Economics and Business, βρίσκεται στο Eindhoven. Εξειδικεύεται στις οικονομικές και τεχνολογικές σπουδές, συνδυάζοντας εφαρμοσμένη έρευνα, καινοτομία και διεθνείς συνεργασίες, προσφέροντας σύγχρονα προγράμματα σε ένα δυναμικό περιβάλλον."
        ));

        // NORWAY
        universityInfoMap.put("Norwegian School of Economics - NHH", new UniversityInfo(
            "Οσλο, Νορβηγία",
            "Το Norwegian School of Economics - NHH, στην Οσλο, είναι ένα από τα κορυφαία πανεπιστήμια οικονομικών στη Νορβηγία. Διακρίνεται για τα ισχυρά προγράμματά του, την έμφαση στην έρευνα και τις διεθνείς συνεργασίες, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες μεθόδους διδασκαλίας."
        ));

        // POLAND
        universityInfoMap.put("Wrocław University of Science and Technology", new UniversityInfo(
            "Wrocław, Πολωνία",
            "Το Wrocław University of Science and Technology, στο Wrocław, εξειδικεύεται στις μηχανικές και τεχνολογικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, προσφέροντας σύγχρονα προγράμματα με πρακτικές εφαρμογές."
        ));

        // SLOVAKIA
        universityInfoMap.put("Univerzita Pavla Jozefa Safarika v Kosiciach", new UniversityInfo(
            "Kosice, Σλοβακία",
            "Το Univerzita Pavla Jozefa Safarika, στη Kosice, είναι το κύριο ίδρυμα της Σλοβακίας με έμφαση στις κοινωνικές και ανθρωπιστικές σπουδές. Διακρίνεται για την ιστορική του παράδοση, τις διεθνείς συνεργασίες και τις σύγχρονες μεθόδους έρευνας."
        ));

        // SPAIN
        universityInfoMap.put("Universitat Politecnica de Catalunya-UPC Barcelona Tech", new UniversityInfo(
            "Barcelona, Ισπανία",
            "Το UPC Barcelona Tech, μέρος του Universitat Politecnica de Catalunya, είναι κορυφαίο τεχνολογικό ίδρυμα στην Ισπανία. Διακρίνεται για την εφαρμοσμένη έρευνα, την καινοτομία και τις διεθνείς συνεργασίες, προσφέροντας υψηλής ποιότητας προγράμματα στις τεχνολογικές σπουδές."
        ));
        universityInfoMap.put("Universitat de Valencia", new UniversityInfo(
            "Valencia, Ισπανία",
            "Το Universitat de Valencia, στη Valencia, είναι ένα ιστορικό ίδρυμα με ολοκληρωμένα προγράμματα στις κοινωνικές και επιστήμες. Συνδυάζει παραδοσιακή γνώση με σύγχρονες μεθόδους έρευνας και διεθνείς συνεργασίες, προωθώντας την καινοτομία."
        ));

        // SWEDEN
        universityInfoMap.put("Ȍrebro Universitet", new UniversityInfo(
            "Örebro, Σουηδία",
            "Το Örebro Universitet, στην πόλη Örebro της Σουηδίας, προσφέρει προγράμματα στις τεχνολογικές, κοινωνικές και ανθρωπιστικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις σύγχρονες εκπαιδευτικές μεθόδους, προωθώντας την καινοτομία."
        ));

        // TURKEY
        universityInfoMap.put("Bahçesehir University", new UniversityInfo(
            "Ιστανμπούλ, Τουρκία",
            "Το Bahçesehir University, στην Ιστανμπούλ, είναι ένα σύγχρονο ίδρυμα με έμφαση στις τεχνολογικές και επιχειρηματικές σπουδές. Διακρίνεται για την εφαρμοσμένη έρευνα, τις διεθνείς συνεργασίες και τις καινοτόμες μεθόδους διδασκαλίας, προωθώντας την ακαδημαϊκή αριστεία."
        ));
        universityInfoMap.put("University of Istanbul - Faculty of Economics", new UniversityInfo(
            "Ιστανμπούλ, Τουρκία",
            "Το University of Istanbul - Faculty of Economics, στην Ιστανμπούλ, εξειδικεύεται στις οικονομικές σπουδές. Διακρίνεται για τα δυναμικά προγράμματά του, τις εφαρμοσμένες μεθόδους έρευνας και τις διεθνείς συνεργασίες, συνδυάζοντας παραδοσιακή γνώση με σύγχρονες εκπαιδευτικές πρακτικές."
        ));

        // ROMANIA
        universityInfoMap.put("Academia de Studii Economice din Bucuresti (ASE)", new UniversityInfo(
            "Βουκουρέστι, Ρουμανία",
            "Η Academia de Studii Economice din Bucuresti (ASE), στη Βουκουρέστι, είναι το κορυφαίο ίδρυμα οικονομικών της Ρουμανίας. Διακρίνεται για τα ισχυρά προγράμματά της, την εφαρμοσμένη έρευνα και τις διεθνείς συνεργασίες, συνδυάζοντας ιστορική παράδοση με σύγχρονες μεθόδους διδασκαλίας."
        ));
        universityInfoMap.put("Universität Wien", new UniversityInfo(
    "Βιέννη, Αυστρία",
    "Η Universität Wien, ιδρυμένη το 1365, είναι ένα από τα αρχαιότερα και μεγαλύτερα πανεπιστήμια στην Ευρώπη. Βρίσκεται στην καρδιά της Βιέννης, πόλη γνωστή για την ιστορία, την τέχνη και την ποιότητα ζωής της."
        ));

        universityInfoMap.put("University of Cyprus", new UniversityInfo(
            "Λευκωσία, Κύπρος",
            "Το University of Cyprus ιδρύθηκε το 1989 και αποτελεί το κύριο ακαδημαϊκό ίδρυμα της χώρας. Είναι επικεντρωμένο στην προαγωγή της έρευνας και προσφέρει πληθώρα μαθημάτων στις επιστήμες και τις ανθρωπιστικές σπουδές."
        ));

        universityInfoMap.put("Telecom Paris", new UniversityInfo(
            "Παρίσι, Γαλλία",
            "Το Telecom Paris, μέρος του Institut Polytechnique de Paris, είναι κορυφαίο στον τομέα της πληροφορικής και των τηλεπικοινωνιών. Βρίσκεται στο Παρίσι, πόλη κόμβος για την τεχνολογία, τον πολιτισμό και την καινοτομία."
        ));

        universityInfoMap.put("CY TECH", new UniversityInfo(
            "Παρίσι, Γαλλία",
            "Το CY TECH βρίσκεται στην περιοχή του Παρισιού και είναι γνωστό για τα προγράμματα στις μηχανικές και την πληροφορική. Η πόλη είναι ένα μεγάλο ακαδημαϊκό κέντρο, προσφέροντας στους φοιτητές πολλές ευκαιρίες για σπουδές και εργασία σε διεθνές περιβάλλον."
        ));

        universityInfoMap.put("EXCELIA", new UniversityInfo(
            "La Rochelle, Γαλλία",
            "Το EXCELIA στη La Rochelle είναι ευρέως γνωστό για τα προγράμματα διοίκησης και επιχειρήσεων. La Rochelle, μια όμορφη παραθαλάσσια πόλη, προσφέρει ένα ιδανικό περιβάλλον για σπουδές με τον συνδυασμό της ιστορίας, της φύσης και της αγοράς εργασίας."
        ));

        universityInfoMap.put("Freie Universität Berlin", new UniversityInfo(
            "Βερολίνο, Γερμανία",
            "Η Freie Universität Berlin, ένα από τα κορυφαία πανεπιστήμια στη Γερμανία, είναι διάσημη για τα προγράμματα των ανθρωπιστικών επιστημών και τις κοινωνικές επιστήμες."
        ));

        universityInfoMap.put("Technische Universität München", new UniversityInfo(
            "Μόναχο, Γερμανία",
            "Το Technische Universität München είναι κορυφαίο στην Ευρώπη για τη μηχανική και την τεχνολογία. Βρίσκεται στο Μόναχο, πόλη γνωστή για την τεχνολογική καινοτομία και την υψηλή ποιότητα ζωής."
        ));

        universityInfoMap.put("Aalborg Universitet", new UniversityInfo(
            "Aalborg, Δανία",
            "Το Aalborg Universitet διακρίνεται για την προσέγγιση 'πρόβλημα-μάθηση', με έμφαση στην ομαδική εργασία και τα προγράμματα μηχανικής."
        ));

        universityInfoMap.put("Università degli Studi di Perugia", new UniversityInfo(
            "Perugia, Ιταλία",
            "Το Università degli Studi di Perugia, ιδρυμένο το 1308, είναι ένα από τα αρχαιότερα πανεπιστήμια στην Ιταλία και είναι γνωστό για τα προγράμματα στις ανθρωπιστικές επιστήμες και το δίκαιο."
        ));

        universityInfoMap.put("Vilnius University", new UniversityInfo(
            "Vilnius, Λιθουανία",
            "Το Vilnius University, ιδρυμένο το 1579, είναι το μεγαλύτερο και παλαιότερο πανεπιστήμιο στη Λιθουανία. Είναι γνωστό για τις ανθρωπιστικές και φυσικές επιστήμες."
        ));

        universityInfoMap.put("Eindhoven University of Technology", new UniversityInfo(
            "Eindhoven, Ολλανδία",
            "Η Eindhoven University of Technology είναι ηγέτης στην τεχνολογική καινοτομία και την επιχειρηματική εκπαίδευση. Η Eindhoven είναι γνωστή ως 'η πόλη της φωτός' λόγω της στενής σχέσης της με την εταιρεία Philips."
        ));

        universityInfoMap.put("Norwegian University of Science & Technology (NTNU)", new UniversityInfo(
            "Τρόντχαϊμ, Νορβηγία",
            "Το NTNU στο Τρόντχαϊμ είναι το κύριο κέντρο για την τεχνολογική εκπαίδευση και έρευνα στη Νορβηγία. Είναι διάσημο για τις μηχανικές και τις φυσικές επιστήμες."
        ));

        universityInfoMap.put("Instituto Politecnico Da Guarda (IPG)", new UniversityInfo(
            "Guarda, Πορτογαλία",
            "Το IPG προσφέρει ποικιλία προγραμμάτων στην τεχνολογία, τις κοινωνικές επιστήμες, και τη διοίκηση."
        ));

        universityInfoMap.put("University of Deusto", new UniversityInfo(
            "Μπιλμπάο, Ισπανία",
            "Το University of Deusto στο Μπιλμπάο προσφέρει προηγμένα προγράμματα στη διοίκηση και τις κοινωνικές επιστήμες. Είναι γνωστό για τον σύγχρονο καμπους και την έμφαση στη διεθνή εκπαίδευση."
        ));

        universityInfoMap.put("Universidad Publica de Navarra", new UniversityInfo(
            "Παμπλόνα, Ισπανία",
            "Η Universidad Publica de Navarra στην Παμπλόνα προσφέρει πλήρες φάσμα ακαδημαϊκών προγραμμάτων, εστιασμένα στις επιστήμες, την τεχνολογία, και την υγεία. Η πόλη είναι διάσημη για το Φεστιβάλ του Αγίου Φερμίν."
        ));

        universityInfoMap.put("Universidad Rey Juan Carlos", new UniversityInfo(
            "Μαδρίτη, Ισπανία",
            "Βρίσκεται στη Μαδρίτη, το Universidad Rey Juan Carlos είναι γνωστό για τα προγράμματα στην τεχνολογία, τις επιστήμες υγείας και τις νομικές σπουδές."
        ));

        universityInfoMap.put("Stockholm University - Department of Computer and Systems Sciences", new UniversityInfo(
            "Στοκχόλμη, Σουηδία",
            "Το Stockholm University είναι γνωστό για την έμφασή του στις επιστήμες του υπολογιστή και τις συστημικές επιστήμες."
        ));
        universityInfoMap.put("Norwegian University of Science & Technology (NTNU)", new UniversityInfo(
            "Τρόντχαϊμ, Νορβηγία",
            "Το NTNU στο Τρόντχαϊμ είναι το κύριο κέντρο για την τεχνολογική εκπαίδευση και έρευνα στη Νορβηγία. Είναι διάσημο για τις μηχανικές και τις φυσικές επιστήμες."
        ));
        universityInfoMap.put("Sorbonne University - Sciences", new UniversityInfo(
            "Παρίσι, Γαλλία",
            "Η Sorbonne University - Sciences, γνωστή για την εξαιρετική έρευνα στις επιστήμες, βρίσκεται στο Παρίσι. Προσφέρει πλούσιο ακαδημαϊκό περιβάλλον με έμφαση στην έρευνα και την καινοτομία."
        ));

        universityInfoMap.put("ENSIIE", new UniversityInfo(
            "Évry, Γαλλία",
            "Το ENSIIE στο Évry προσφέρει εξειδικευμένα προγράμματα στην πληροφορική και την επιχειρησιακή ανάλυση. Είναι κοντά στο Παρίσι, παρέχοντας πρόσβαση σε επαγγελματικές ευκαιρίες και πολιτιστική ποικιλομορφία."
        ));
    }

    public static Map<String, UniversityInfo> getUniversityInfoMap() {
        return universityInfoMap;
    }
}
