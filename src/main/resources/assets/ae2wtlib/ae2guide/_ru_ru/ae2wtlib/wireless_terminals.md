---
navigation:
  parent: ae2wtlib/ae2wtlib-index.md
  title: Беспроводные терминалы AE2WTLib
  icon: ae2wtlib:wireless_universal_terminal
  position: 10
categories:
- ae2wtlib
item_ids:
  - ae2wtlib:wireless_pattern_encoding_terminal
  - ae2wtlib:wireless_pattern_access_terminal
---

# Беспроводные терминалы

<ItemGrid>
  <ItemIcon id="ae2wtlib:wireless_universal_terminal" />
  <ItemIcon id="ae2:wireless_crafting_terminal" />
  <ItemIcon id="ae2wtlib:wireless_pattern_encoding_terminal" />
  <ItemIcon id="ae2wtlib:wireless_pattern_access_terminal" />
</ItemGrid>

Помимо <ItemLink id="ae2:energy_card" />, все беспроводные терминалы AE2WTLib
поддерживают <ItemLink id="ae2wtlib:quantum_bridge_card" /> и могут объединяться в <ItemLink id="ae2wtlib:wireless_universal_terminal" />.

Как и <ItemLink id="ae2:wireless_terminal" /> из AE2, их можно открывать горячей клавишей
и помещать в слот аксессуара (если установлен мод, реализующий API Curios).

Беспроводные терминалы также привязываются как обычный <ItemLink id="ae2:wireless_terminal" />, через <ItemLink id="ae2:wireless_access_point" />

## Беспроводной универсальный терминал

<ItemImage id="ae2wtlib:wireless_universal_terminal" scale="3" />

<ItemLink id="ae2wtlib:wireless_universal_terminal" /> объединяет несколько беспроводных терминалов в одном предмете.

## Беспроводной терминал изготовления

<ItemImage id="ae2:wireless_crafting_terminal" scale="3" />

<ItemLink id="ae2:wireless_crafting_terminal" /> — беспроводная версия терминала изготовления. По сравнению
с базовым AE2 у него есть [дополнительные возможности](wireless_crafting_terminal.md).

## Беспроводной терминал кодирования шаблонов

<ItemImage id="ae2wtlib:wireless_pattern_encoding_terminal" scale="3" />

Беспроводная версия <ItemLink id="ae2:pattern_encoding_terminal" />

<RecipeFor id="ae2wtlib:wireless_pattern_encoding_terminal" />

## Беспроводной терминал доступа к шаблонам

<ItemImage id="ae2wtlib:wireless_pattern_access_terminal" scale="3" />

Беспроводная версия <ItemLink id="ae2:pattern_access_terminal" />

<RecipeFor id="ae2wtlib:wireless_pattern_access_terminal" />

## Терминалы других аддонов

Большинство беспроводных терминалов других аддонов также совместимы с <ItemLink id="ae2wtlib:wireless_universal_terminal" />.

## Терминалы, не работающие в универсальном терминале

<ItemLink id="ae2:wireless_terminal" /> нельзя использовать в <ItemLink id="ae2wtlib:wireless_universal_terminal" />, поскольку
он не даёт преимуществ перед <ItemLink id="ae2:wireless_crafting_terminal" />.
Кроме того, он не поддерживает <ItemLink id="ae2wtlib:quantum_bridge_card" />
