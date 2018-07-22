<?php

namespace php\gui;

use php\gui\layout\UXRegion;

class UXVirtualizedScrollPane extends UXRegion
{
    /**
     * @var double
     */
    public $scrollX;

    /**
     * @var double
     */
    public $scrollY;

    /**
     * UXVirtualizedScrollPane constructor.
     * @param UXGenericStyledArea $area
     */
    public function __construct(UXGenericStyledArea $area) {}
}