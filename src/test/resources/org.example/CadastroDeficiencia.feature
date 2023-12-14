Feature: Cadastro de Deficiência

  Scenario Outline: Cadastrar uma deficiência com sucesso
    Given  dado as informações sobre uma deficiênca: <nome> e <categoria>
    When a deficiênca é cadastrada
    Then o cadastro da deficiência é bem-sucedido
    And as informações da deficiência são exibidas corretamente
    Examples:
      |nome        |categoria|
      |"Transtorno do Espectro Autista (TEA)"|"COGNITIVA"|