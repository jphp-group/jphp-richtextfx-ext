<?php 

\php\gui\UXApplication::runLater(function () {
    $form = new \php\gui\UXForm();

    $styledText = new \php\gui\UXInlineCssTextArea();
    $styledText->appendText(\php\lib\str::repeat("text\n", 6), '-fx-fill: gray');
    $styledText->setStyle(13, 24, '-fx-fill: red');
    $scrollPane = new \php\gui\UXStyledTextAreaScrollPane($styledText);
    \php\gui\layout\UXAnchorPane::setAnchor($scrollPane, 0);

    $form->add($scrollPane);
    $form->show();
});