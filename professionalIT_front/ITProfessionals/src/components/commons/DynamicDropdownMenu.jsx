import React, { useState } from 'react';
import { DropdownMenu, DropdownMenuTrigger, DropdownMenuContent, DropdownMenuCheckboxItem, Button } from '@headlessui/react';
import { ChevronDownIcon } from '@heroicons/react/solid';

const DynamicDropdownMenu = ({ filtro, options, defaultOption, handleFilterChange }) => {
  const [selectedOption, setSelectedOption] = useState(defaultOption);

  const handleOptionChange = (option) => {
    setSelectedOption(option);
    handleFilterChange(filtro, option);
  };

  return (
    <DropdownMenu>
      <DropdownMenuTrigger asChild>
        <Button className="w-full justify-between text-left" id={filtro} variant="outline">
          <span className="sr-only">Open</span>
          {selectedOption ? selectedOption : 'Select Option'}
          <ChevronDownIcon className="h-4 w-4 ml-2 shrink-0" />
        </Button>
      </DropdownMenuTrigger>
      <DropdownMenuContent className="mt-1 w-[calc(100%+1px)]">
        {options.map((option, index) => (
          <DropdownMenuCheckboxItem key={index} onClick={() => handleOptionChange(option)}>{option}</DropdownMenuCheckboxItem>
        ))}
      </DropdownMenuContent>
    </DropdownMenu>
  );
};

export default DynamicDropdownMenu;
