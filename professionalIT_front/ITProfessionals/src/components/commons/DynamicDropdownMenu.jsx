import React, { useState } from 'react';
import { Label } from "@/components/ui/label"
import { Button } from "@/components/ui/button"
import { DropdownMenuTrigger, DropdownMenuCheckboxItem, DropdownMenuContent, DropdownMenu } from "@/components/ui/dropdown-menu"


const DynamicDropdownMenu = ({ filter, options, defaultOption, handleFilterChange }) => {
  const [selectedOption, setSelectedOption] = useState(defaultOption);

  const handleOptionChange = (value, name) => {
    setSelectedOption(name);
    
    handleFilterChange(formatCamelCase(filter), value);
  };

  const formatCamelCase = input => {
    const formattedString = input.replace(/_([a-z])/g, (match, letter) => letter.toUpperCase());
    return formattedString;
  };
  

  return (
    <DropdownMenu>
      <DropdownMenuTrigger asChild>
        <Button className="w-full justify-between text-left" id={filter} variant="outline">
          <span className="sr-only">Open</span>
          {selectedOption ? selectedOption : 'Select Option'}
          <ChevronDownIcon className="h-4 w-4 ml-2 shrink-0" />
        </Button>
      </DropdownMenuTrigger>
      <DropdownMenuContent className="mt-1 w-[calc(100%+1px)]">
      {options.map((option, index) => (
        <DropdownMenuCheckboxItem key={index} onClick={() => handleOptionChange(option.id, option.name)}>{option.name}</DropdownMenuCheckboxItem>
      ))}
      </DropdownMenuContent>
    </DropdownMenu>
  );
};

function ChevronDownIcon(props) {
  return (
    <svg
      {...props}
      xmlns="http://www.w3.org/2000/svg"
      width="24"
      height="24"
      viewBox="0 0 24 24"
      fill="none"
      stroke="currentColor"
      strokeWidth="2"
      strokeLinecap="round"
      strokeLinejoin="round"
    >
      <path d="m6 9 6 6 6-6" />
    </svg>
  )
}

export default DynamicDropdownMenu;
