<?php
namespace php\gui;


use php\gui\layout\UXRegion;

class UXStyledTextAreaScrollPane extends UXRegion
{
    public $scrollY;

    public $scrollX;

    public function __construct(UXInlineCssTextArea $area) {}
}