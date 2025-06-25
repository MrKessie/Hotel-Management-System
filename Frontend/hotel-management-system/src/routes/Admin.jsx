import { React } from "react";
import { Route } from "react-router-dom";

import AuthLogin from "../pages/auth/Login";
import AuthLogout from "../pages/auth/Logout";
import AuthRecoverPasseord from "../pages/auth/ResetPassword";
import AuthRegister from "../pages/auth/Register";


const AuthRoutes = () => {
    return (
        <Route path="auth" element={<AuthenticationLayout />}>
            <Route path="login" element={<LoginRedirect><AuthLogin /></LoginRedirect>} />
            <Route path="recover-password" element={<LoginRedirect><AuthRecoverPassword /></LoginRedirect>} />
            <Route path="change-password" element={<LoginRedirect><AuthChangePassword /></LoginRedirect>} />
            <Route path="verify-token" element={<LoginRedirect><AuthVerifyResetToken /></LoginRedirect>} />
            <Route path="lock-screen" element={<AuthLockScreen />} />
            <Route path="logout" element={<AuthLogout />} />
        </Route>
    );
};

export default AuthRoutes;