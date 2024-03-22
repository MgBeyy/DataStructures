public class ZiyaretciKuyrugu {
    int front;  // Kuyruğun ilk elemanının indeksi
    int rear;   // Kuyruğun son elemanının indeksi
    Ziyaretci[] queue;  // Kuyruğun tutulduğu dizi
    int coaster_size;   // Jet Coaster'ın alabildiği kişi sayısı
    int max_size;       // Sıraya girebilecek max kişi sayısı
    int size;           // Kuyruktaki mevcut eleman sayısı

    public ZiyaretciKuyrugu(int max_size, int coaster_size) {
        this.front = 0;
        this.rear = -1;
        this.coaster_size = coaster_size;
        this.max_size = max_size;
        this.size = 0;  // Başlangıçta kuyruk boş olduğu için size 0'dır.
        queue = new Ziyaretci[max_size];
    }

    // Kuyruğa eleman eklemek için yöntem
    void enqueue(String value) {
        if (isFull()) {
            System.out.println("Kuyruk zaten dolu. Daha fazla eleman eklenemez.");
        }
        if (unique(value)) {
            rear = (rear + 1) % max_size;
            queue[rear] = new Ziyaretci(value);
            size++;
        }
    }

    // Kuyruktan eleman çıkarmak için yöntem
    void dequeue() {
        for (int i = 0; i < coaster_size; i++) {
            if (isEmpty()) {
                System.out.println("Kuyruk zaten boş.");
                break;
            } else {
                front = (front + 1) % max_size;
                size--;
            }
        }
    }

    // Kuyruğun boş olup olmadığını kontrol etmek için yöntem
    Boolean isEmpty() {
        return size == 0;
    }

    // Kuyruğun dolu olup olmadığını kontrol etmek için yöntem
    Boolean isFull() {
        return size == max_size;
    }

    // Kuyruğu ekrana yazdırmak için yöntem
    void display() {
        for (int i = front; i % max_size <= rear; i++) {
            System.out.println(queue[i].name);
        }
        System.out.println("_________________");
    }

    // Kuyruktaki eleman sayısını saymak için yöntem
    int counter() {
        int c = 0;
        for (int i = front; i % max_size <= rear; i++) {
            c++;
        }
        return c;
    }

    // Kuyruğa eklenecek isimlerin benzersiz olup olmadığını kontrol etmek için yöntem
    Boolean unique(String name) {
        for (int i = front; i % max_size <= rear; i++) {
            if (queue[i].name.equals(name)) {
                System.out.println("Lütfen benzersiz bir isim yazın.");
                return false;
            }
        }
        return true;
    }
}
