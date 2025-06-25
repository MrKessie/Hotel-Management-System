import { useEffect, useMemo, useRef } from "react";
import { Navigate, Route, Routes, useLocation } from "react-router-dom";

import authPageRoutes from "./routes/Auth";

function App() {
  const [count, setCount] = useState(0)

  return (
    <Routes>
      {authPageRoutes()}
    </Routes>
  )
}

export default App
