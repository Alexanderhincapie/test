Feature: HorasdelDia

  Scenario: Es night cuando hora es antes de 6 y despues de 0
    Given Hora 5
    When verificamos que sea Night
    Then Obtenemos Night