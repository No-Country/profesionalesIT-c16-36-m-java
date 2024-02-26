import React from 'react'

export default function LookingFor () {
  return (
    <>

        <h3>What I am looking for</h3>

        <h4>Job</h4>

        <div className="info">
            <h5 class="tagdescription">Positions:</h5>
            <p class="tag">QA Junior</p>
            <p class="tag">Similar positions</p>
        </div>

        <div class="info">
            <h5 class="tagdescription">Modality:</h5>
            <p class="tag">Remote</p>
            <p class="tag">Hybrid</p>
            <p class="tag">On-site</p>
        </div>

        <h4>Salary</h4>

        <div class="info">
            <h5 class="tagdescription">Salary range:</h5>
            <p class="tag">Unspecified</p>
        </div>

        <div class="info">
            <h5 class="tagdescription">Payment:</h5>
            <p class="tag">USD</p>
            <p class="tag">MXN</p>
        </div>

        <h4>Schedule</h4>

        <div class="info">
            <h5 class="tagdescription">Work schedule:</h5>
            <p class="tag">Full-time</p>
            <p class="tag">Part-time</p>
        </div>

        <div class="info">
            <h5 class="tagdescription">Work shift schedule:</h5>
            <p class="tag">Morning shift</p>
            <p class="tag">Afternoon shift</p>
        </div>

        <h4>Company</h4>

        <div class="info">
            <h5 class="tagdescription">A company with...</h5>
            <p class="tag">Unspecified</p>
        </div>

    </>
  );
}