
public class Main {
    public static void main(String[] args) {
        SaveDocument txt = new SaveDocumentTxt();
        SaveDocument json = new SaveDocumentJson();
        SaveDocument xml = new SaveDocumentXml();

        txt.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "Иван Иванов=4.8");
        txt.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "Мария Кузнецова=5.0");
        txt.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "Степан Кузьмин=3.6");

        json.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "{");
        json.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "\"Иван Иванов\": 4.8,");
        json.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "\"Мария Кузнецова\": 5.0,");
        json.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "\"Степан Кузьмин\": 3.6");
        json.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "}");

        xml.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
        xml.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "<students>");
        xml.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "<student>");
        xml.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "<name>Иван Иванов</name>");
        xml.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "<grade>4.8</grade>");
        xml.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "</student>");
        xml.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "<student>");
        xml.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "<name>Мария Кузнецова</name>");
        xml.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "<grade>5.0</grade>");
        xml.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "</student>");
        xml.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "<student>");
        xml.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "<name>Степан Кузьмин</name>");
        xml.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "<grade>3.6</grade>");
        xml.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "</student>");
        xml.LineSaveDoс("D:/Загрузки/1/s/dz/2 четверть/Java/OOP/homework/dz2/DOC", "file", "</students>");
    }

}