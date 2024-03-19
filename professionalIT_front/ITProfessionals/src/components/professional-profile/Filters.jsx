import { Label } from "@/components/ui/label"
import { Button } from "@/components/ui/button"
import { DropdownMenuTrigger, DropdownMenuCheckboxItem, DropdownMenuContent, DropdownMenu } from "@/components/ui/dropdown-menu"
import { get } from "../../api"
import React, { useEffect, useState } from 'react'
import DynamicDropdownMenu from "../commons/DynamicDropdownMenu"

export default function Filters({ onFilterChange }) {

  const seniorityOptions = ["TRAINEE", "JUNIOR", "SEMI_SENIOR", "SENIOR", "LEAD", "PRINCIPAL"];

  const seniorityOptionsWithKeys = seniorityOptions.map(option => ({
    id: option,
    name: option
  }));

  const [filterOptions, setFilterOptions] = useState({
    seniority: seniorityOptionsWithKeys
  });

  useEffect(() => {
    fillOptions();
  }, []);

  const fillOptions = () => {
    // Fetch options for the dropdowns
    fetchData('/mode/get-all', "modality");
    fetchData('/softskill/get-all', 'soft_skills');
    fetchData('/hardskill/get-all','hard_skills');
    fetchData('/country','country');
    fetchData('/field/get-all','fields');
  }

  // filling menus with options
  const fetchData = (url, filterName) => {
    get(url)
      .then(res => {
        // Map the response data to an array of objects with both ID and name
        const options = res.data.map(item => ({
          id: item.id,
          name: item.name
        }));

        setFilterOptions(prevOptions => ({
          ...prevOptions,
          [filterName]: options
        }));
      })
      .catch(error => {
        console.error(`Error getting options for url ${url}:`, error);
      });
  };

  // Fill selected options
  const handleFilterChange = (filtro, valor) => {
    onFilterChange(filtro, valor);
  };

  const formatFilterName = (filter) => {  
    const formattedFilter = filter.charAt(0).toUpperCase() + filter.slice(1);
    return formattedFilter.replace(/_/g, ' ');
  };

  
  return (
    <section className="px-4 md:px-6 py-6 md:py-12">
      <div className="container grid gap-6">
        <div className="flex flex-col md:flex-row items-start md:items-center gap-4 md:gap-8">
          <div className="grid gap-1">
            <h1 className="text-3xl font-bold tracking-tight">Find the Perfect Match</h1>
            <p className="text-gray-500 dark:text-gray-400">
              Discover and Connect with Professionals that Match Your Criteria.
            </p>
          </div>
        </div>
        <div className="grid gap-4 md:gap-8">
          <div className="grid gap-4 md:gap-8">
            {
              // Select options for the dropdowns
              Object.entries(filterOptions).map((
                [filter, options], index) => (
                <div key={index} className="grid gap-2">
                  <Label className="text-sm" htmlFor={filter}>
                    {formatFilterName(filter)}
                  </Label>
                  <DynamicDropdownMenu filter={filter} options={options} defaultOption="Select an option" handleFilterChange={handleFilterChange} />
                </div>
              ))
            }
          </div>
        </div>
      </div>
    </section>
  )
}

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
