import React, { useEffect, useState } from 'react'
import ProfessionalCard from '../../../components/professional-profile/ProfessionalCard'
import Filters from '../../../components/professional-profile/Filters'
import { getWithParams } from '../../../api/index.jsx'

export default function Catalog() {

    const [professionals, setProfessionals] = useState([])
    const [filtros, setFiltros] = useState({
      });

    const handleFilterChange = (filtro, valor) => {
        console.log("Filtro:", filtro, "Valor:", valor);
        setFiltros(prevFiltros => ({
            ...prevFiltros,
            [filtro]: valor
        }));
        console.log(filtros)
    };

    useEffect(() => {
        getWithParams('/professionals/filter', filtros)
            .then(res => {
                setProfessionals(res.data)
            }
        )
    }, [])

    const filteredProfessionals = () => {
        const url = '/professionals/filter';
    
        // Request using filters as params
        getWithParams(url, filtros)
          .then(res => {
            setProfessionals(res.data);
          })
          .catch(error => {
            console.error('Error obtaining professionals:', error);
          });
      };
    
      
      const handleSearch = () => {
        filteredProfessionals();
      };



    return (
        <div className="flex flex-row">
            <div className="w-1/4 p-4">
                <Filters onFilterChange={handleFilterChange}/>
                <button onClick={handleSearch}>Search</button>
            </div>
            <div className="w-3/4 p-4">
                <div className='min-h-screen text-white flex flex-wrap justify-center gap-4'>
                    {professionals.map(professional => (
                        <ProfessionalCard key={professional.person.name} professional={professional}/>
                    ))}
                </div>
            </div>
        </div>
    )
}

