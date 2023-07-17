package homework5;

public class phonebook {
                public static void phonebook() {
                Directory directory = new Directory();
                
                directory.add("Иванов", "851823");
                directory.add("Шушлебин", "852946");
                directory.add("Зайцева", "856092");
                directory.add("Черных", "854675");
                directory.add("Ломоносов", "851235");
                directory.add("Балабанов", "852140");
                directory.add("Иванов", "850052");
                directory.add("Зайцева", "852400");
                directory.add("Петров", "859945");
                
                System.out.println("Запросы по фамилиям:\n~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.printf("Иванов: %s\n", directory.get("Иванов"));
                System.out.printf("Черных: %s\n",directory.get("Черных"));
                System.out.printf("Петров: %s\n",directory.get("Петров"));
                System.out.printf("Зайцева: %s\n", directory.get("Зайцева"));
            }
    public static void main(String[] args) {
            phonebook();
        }
        }
