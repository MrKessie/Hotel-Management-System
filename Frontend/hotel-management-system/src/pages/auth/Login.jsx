import React from 'react'

const Login = () => {
    return (
        <>
        <div className="auth-fluid">
  {/*Auth fluid left content */}
  <div className="auth-fluid-form-box">
    <div className="align-items-center d-flex h-100">
      <div className="p-3">
        {/* Logo */}
        <div className="auth-brand text-center text-lg-start">
          <div className="auth-brand">
            <a href="index.html" className="logo logo-dark text-center">
              <span className="logo-lg">
                <img src="assets/images/logo-dark.png" alt height={22} />
              </span>
            </a>
            <a href="index.html" className="logo logo-light text-center">
              <span className="logo-lg">
                <img src="assets/images/logo-light.png" alt height={22} />
              </span>
            </a>
          </div>
        </div>
        <ul className="nav nav-tabs nav-bordered">
          <li className="nav-item">
            <a href="auth-signin-signup-2.html#tab-login" data-bs-toggle="tab" aria-expanded="false" className="nav-link active">
              Log In
            </a>
          </li>
          <li className="nav-item">
            <a href="auth-signin-signup-2.html#tab-signup" data-bs-toggle="tab" aria-expanded="true" className="nav-link">
              Sign Up
            </a>
          </li>
        </ul>
        <div className="tab-content">
          <div className="tab-pane show active" id="tab-login">
            <p className="text-muted mb-3">Enter your email address and password to access account.</p>
            {/* form */}
            <form action="auth-signin-signup-2.html#">
              <div className="mb-3">
                <label htmlFor="emailaddress" className="form-label">Email address</label>
                <input className="form-control" type="email" id="emailaddress" required placeholder="Enter your email" />
              </div>
              <div className="mb-3">
                <a href="auth-recoverpw-2.html" className="text-muted float-end"><small>Forgot your password?</small></a>
                <label htmlFor="password" className="form-label">Password</label>
                <input className="form-control" type="password" required id="password" placeholder="Enter your password" />
              </div>
              <div className="mb-3">
                <div className="form-check">
                  <input type="checkbox" className="form-check-input" id="checkbox-signin" />
                  <label className="form-check-label" htmlFor="checkbox-signin">Remember me</label>
                </div>
              </div>
              <div className="text-center d-grid">
                <button className="btn btn-primary" type="submit">Log In </button>
              </div>
              {/* social*/}
              <div className="text-center mt-4">
                <p className="text-muted font-16">Sign in with</p>
                <ul className="social-list list-inline mt-3">
                  <li className="list-inline-item">
                    <a href="javascript: void(0);" className="social-list-item border-primary text-primary"><i className="mdi mdi-facebook" /></a>
                  </li>
                  <li className="list-inline-item">
                    <a href="javascript: void(0);" className="social-list-item border-danger text-danger"><i className="mdi mdi-google" /></a>
                  </li>
                  <li className="list-inline-item">
                    <a href="javascript: void(0);" className="social-list-item border-info text-info"><i className="mdi mdi-twitter" /></a>
                  </li>
                  <li className="list-inline-item">
                    <a href="javascript: void(0);" className="social-list-item border-secondary text-secondary"><i className="mdi mdi-github" /></a>
                  </li>
                </ul>
              </div>
            </form>
            {/* end form*/}
          </div>
          <div className="tab-pane" id="tab-signup">
            <p className="text-muted mb-3">Don't have an account? Create your account, it takes less than a minute</p>
            {/* form */}
            <form action="auth-signin-signup-2.html#">
              <div className="mb-3">
                <label htmlFor="fullname" className="form-label">Full Name</label>
                <input className="form-control" type="text" id="fullname" placeholder="Enter your name" required />
              </div>
              <div className="mb-3">
                <label htmlFor="emailaddress" className="form-label">Email address</label>
                <input className="form-control" type="email" id="emailaddress" required placeholder="Enter your email" />
              </div>
              <div className="mb-3">
                <label htmlFor="password" className="form-label">Password</label>
                <input className="form-control" type="password" required id="password" placeholder="Enter your password" />
              </div>
              <div className="mb-3">
                <div className="form-check">
                  <input type="checkbox" className="form-check-input" id="checkbox-signup" />
                  <label className="form-check-label" htmlFor="checkbox-signup">I accept <a href="javascript: void(0);" className="text-dark">Terms and Conditions</a></label>
                </div>
              </div>
              <div className="text-center d-grid">
                <button className="btn btn-primary waves-effect waves-light" type="submit"> Sign Up </button>
              </div>
              {/* social*/}
              <div className="text-center mt-4">
                <p className="text-muted font-16">Sign up with</p>
                <ul className="social-list list-inline mt-3 mb-0">
                  <li className="list-inline-item">
                    <a href="javascript: void(0);" className="social-list-item border-primary text-primary"><i className="mdi mdi-facebook" /></a>
                  </li>
                  <li className="list-inline-item">
                    <a href="javascript: void(0);" className="social-list-item border-danger text-danger"><i className="mdi mdi-google" /></a>
                  </li>
                  <li className="list-inline-item">
                    <a href="javascript: void(0);" className="social-list-item border-info text-info"><i className="mdi mdi-twitter" /></a>
                  </li>
                  <li className="list-inline-item">
                    <a href="javascript: void(0);" className="social-list-item border-secondary text-secondary"><i className="mdi mdi-github" /></a>
                  </li>
                </ul>
              </div>
            </form>
            {/* end form*/}
          </div>
        </div>
        <footer className="footer footer-alt">
          <p className="text-muted">2015 -  © UBold theme by <a href="javascript: void(0);" className="text-muted">Coderthemes</a> </p>
        </footer>
      </div> {/* end .card-body */}
    </div> {/* end .align-items-center.d-flex.h-100*/}
  </div>
  {/* end auth-fluid-form-box*/}
  {/* Auth fluid right content */}
  <div className="auth-fluid-right text-center">
    <div className="auth-user-testimonial">
      <h2 className="mb-3 text-white">I love the color!</h2>
      <p className="lead"><i className="mdi mdi-format-quote-open" /> I've been using your theme from the previous developer for our web app, once I knew new version is out, I immediately bought with no hesitation. Great themes, good documentation with lots of customization available and sample app that really fit our need. <i className="mdi mdi-format-quote-close" />
      </p>
      <h5 className="text-white">
        - Fadlisaad (Ubold Admin User)
      </h5>
    </div> {/* end auth-user-testimonial*/}
  </div>
  {/* end Auth fluid right content */}
</div>
{/* end auth-fluid*/}

        </>
    )
}
export default Login;