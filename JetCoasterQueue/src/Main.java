public class Main {
    public static void main(String[] args) {
        ZiyaretciKuyrugu kuyruk = new ZiyaretciKuyrugu(10, 3); // Maksimum boyut: 10, Coaster boyutu: 3

        // Kuyruğa ziyaretçileri ekleyelim
        kuyruk.enqueue("Ahmet");
        kuyruk.enqueue("Ayşe");
        kuyruk.enqueue("Fatma");
        kuyruk.enqueue("Hüseyin");
        kuyruk.enqueue("Mehmet");

        // Kuyruğu görüntüleyelim
        System.out.println("Kuyruktaki ziyaretçiler:");
        kuyruk.display();

        // Kuyruktan ziyaretçileri çıkaralım
        kuyruk.dequeue();

        // Kuyruğu görüntüleyelim
        System.out.println("Kuyruktaki ziyaretçiler:");
        kuyruk.display();

        // Kuyruğa ziyaretçileri ekleyelim
        kuyruk.enqueue("Zeynep");
        kuyruk.enqueue("Burak");

        // Kuyruğu görüntüleyelim
        System.out.println("Kuyruktaki ziyaretçiler:");
        kuyruk.display();

        // Kuyruktan ziyaretçileri çıkaralım
        kuyruk.dequeue();


        // Kuyruktaki ziyaretçi sayısını kontrol edelim
        System.out.println("Kuyruktaki toplam ziyaretçi sayısı: " + kuyruk.counter());
    }
}
