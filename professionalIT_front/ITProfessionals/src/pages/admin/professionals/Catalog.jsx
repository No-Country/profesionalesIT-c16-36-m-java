import React from 'react'
import ProfessionalCard from '../../../components/professional-profile/ProfessionalCard'
import Filters from '../../../components/professional-profile/Filters'

export default function Catalog() {
    return (
        <div className="flex flex-row">
            <div className="w-1/4 p-4">
                <Filters/>
            </div>

            <div className="w-3/4 p-4">
                <div className='min-h-screen text-white flex flex-wrap justify-center gap-4'>
                    <ProfessionalCard/>
                    <ProfessionalCard/>
                    <ProfessionalCard/>
                    <ProfessionalCard/>
                    <ProfessionalCard/>
                    <ProfessionalCard/>
                    <ProfessionalCard/>
                    <ProfessionalCard/>
                </div>
            </div>
        </div>
    )
}
