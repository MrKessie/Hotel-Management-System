import React from 'react'

const RecoverPassword = () => {
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
        {/* title*/}
        <h4 className="mt-0">Recover Password</h4>
        <p className="text-muted mb-4">Enter your email address and we'll send you an email with instructions to reset your password.</p>
        {/* form */}
        <form action="auth-recoverpw-2.html#">
          <div className="mb-3">
            <label htmlFor="emailaddress" className="form-label">Email address</label>
            <input className="form-control" type="email" id="emailaddress" required placeholder="Enter your email" />
          </div>
          <div className="text-center d-grid">
            <button className="btn btn-primary waves-effect waves-light" type="submit"> Reset Password </button>
          </div>
        </form>
        {/* end form*/}
        {/* Footer*/}
        <footer className="footer footer-alt">
          <p className="text-muted">Back to <a href="auth-login-2.html" className="text-muted ms-1"><b>Log in</b></a></p>
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
{/* Authentication js */}

        </>
    )
}