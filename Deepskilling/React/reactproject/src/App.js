// import Home from './task2/Home';
// import About from './task2/About';
// import Contact from './task2/Contact';
// import CalculateScore from './task3/CalculateScore';
// import Posts from './task4/Posts';
import CohortDetails from './task5/CohortDetails';

function App() {
  return (
    <div className='container'>
        {/* <Home/>
        <About/>
        <Contact/>
        <CalculateScore name={"Manu"} school={"CVR"} total={300} goal={3} />
        <Posts/> */}
        <CohortDetails cohort={{
          currentStatus: "Ongoing",
          cohortCode: 1021,
          technology: "tech",
          startDate: "01-10-2026",
          coachName: "Manu",
          trainerName: "Akki"
        }}/>
    </div>
  );
}

export default App;
