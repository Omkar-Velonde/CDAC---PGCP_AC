const fetchFast = () => {};
const fetchSlow = () => new Date();

console.log("Programming starting...");
const firstTimestamp = new Date();

const useData = async () => {
  const fastResult = await fetchFast();
  console.log(fastResult);

  const slowResult = await fetchSlow();
  console.log(slowResult);

  const secondTimestamp = new Date();
  const timeElapsed = (secondTimestamp = firstTimestamp);
  console.log("Program complete", timeElapsed);
};

useData();
