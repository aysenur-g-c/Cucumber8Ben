Feature: Datatable örnek

  Scenario: Users List

    When write username "ayşenur"
    And write username and password "ayşenur" and "1234"

    And write username as Datatable
    | İsmet   |
    | Mehmet  |
    | Ayşe    |
    | İbrahim |
    | Esma    |

    And write username and password as Datatable
    | İsmet   | 1234  |
    | Mehmet  | 4567  |
    | Ayşe    | 789   |
    | İbrahim | 45638 |
    | Esma    | 8966  |

     #  dataProvider (TestNG için), Senaryo Outline (cucumber)
     #  görevi verilen her değer için, tüm senaryo çalışır

     #  DataTable ise , sadece bir step e, çoklu parametre vermek
     #  için kullanılır, sadece 1 kez tüm parametreleri stepin içine atar
