import React from 'react'

const Dashboard = () => {
    return (
        <>
        <div className="content">
            </div>


                    {/* Start Content*/}
                <div className="container-fluid">
                {/* start page title */}
                <div className="row">
                    <div className="col-12">
                    <div className="page-title-box">
                        <div className="page-title-right">
                        <ol className="breadcrumb m-0">
                            <li className="breadcrumb-item"><a href="javascript: void(0);">UBold</a></li>
                            <li className="breadcrumb-item"><a href="javascript: void(0);">Dashboards</a></li>
                            <li className="breadcrumb-item active">Dashboard 2</li>
                        </ol>
                        </div>
                        <h4 className="page-title">Dashboard 2</h4>
                    </div>
                    </div>
                </div>
                {/* end page title */}
                <div className="row">
                    <div className="col-md-6 col-xl-3">
                    <div className="card">
                        <div className="card-body">
                        <div className="row">
                            <div className="col-6">
                            <div className="avatar-sm bg-blue rounded">
                                <i className="fe-aperture avatar-title font-22 text-white" />
                            </div>
                            </div>
                            <div className="col-6">
                            <div className="text-end">
                                <h3 className="text-dark my-1">$<span data-plugin="counterup">12,145</span></h3>
                                <p className="text-muted mb-1 text-truncate">Income status</p>
                            </div>
                            </div>
                        </div>
                        <div className="mt-3">
                            <h6 className="text-uppercase">Target <span className="float-end">60%</span></h6>
                            <div className="progress progress-sm m-0">
                            <div className="progress-bar bg-blue" role="progressbar" aria-valuenow={60} aria-valuemin={0} aria-valuemax={100} style={{width: '60%'}}>
                                <span className="visually-hidden">60% Complete</span>
                            </div>
                            </div>
                        </div>
                        </div>
                    </div> {/* end card*/}
                    </div> {/* end col */}
                    <div className="col-md-6 col-xl-3">
                    <div className="card">
                        <div className="card-body">
                        <div className="row">
                            <div className="col-6">
                            <div className="avatar-sm bg-success rounded">
                                <i className="fe-shopping-cart avatar-title font-22 text-white" />
                            </div>
                            </div>
                            <div className="col-6">
                            <div className="text-end">
                                <h3 className="text-dark my-1"><span data-plugin="counterup">1576</span></h3>
                                <p className="text-muted mb-1 text-truncate">January's Sales</p>
                            </div>
                            </div>
                        </div>
                        <div className="mt-3">
                            <h6 className="text-uppercase">Target <span className="float-end">49%</span></h6>
                            <div className="progress progress-sm m-0">
                            <div className="progress-bar bg-success" role="progressbar" aria-valuenow={49} aria-valuemin={0} aria-valuemax={100} style={{width: '49%'}}>
                                <span className="visually-hidden">49% Complete</span>
                            </div>
                            </div>
                        </div>
                        </div>
                    </div> {/* end card*/}
                    </div> {/* end col */}
                    <div className="col-md-6 col-xl-3">
                    <div className="card">
                        <div className="card-body">
                        <div className="row">
                            <div className="col-6">
                            <div className="avatar-sm bg-warning rounded">
                                <i className="fe-bar-chart-2 avatar-title font-22 text-white" />
                            </div>
                            </div>
                            <div className="col-6">
                            <div className="text-end">
                                <h3 className="text-dark my-1">$<span data-plugin="counterup">8947</span></h3>
                                <p className="text-muted mb-1 text-truncate">Payouts</p>
                            </div>
                            </div>
                        </div>
                        <div className="mt-3">
                            <h6 className="text-uppercase">Target <span className="float-end">18%</span></h6>
                            <div className="progress progress-sm m-0">
                            <div className="progress-bar bg-warning" role="progressbar" aria-valuenow={18} aria-valuemin={0} aria-valuemax={100} style={{width: '18%'}}>
                                <span className="visually-hidden">18% Complete</span>
                            </div>
                            </div>
                        </div>
                        </div>
                    </div> {/* end card*/}
                    </div> {/* end col */}
                    <div className="col-md-6 col-xl-3">
                    <div className="card">
                        <div className="card-body">
                        <div className="row">
                            <div className="col-6">
                            <div className="avatar-sm bg-info rounded">
                                <i className="fe-cpu avatar-title font-22 text-white" />
                            </div>
                            </div>
                            <div className="col-6">
                            <div className="text-end">
                                <h3 className="text-dark my-1"><span data-plugin="counterup">178</span></h3>
                                <p className="text-muted mb-1 text-truncate">Available Stores</p>
                            </div>
                            </div>
                        </div>
                        <div className="mt-3">
                            <h6 className="text-uppercase">Target <span className="float-end">74%</span></h6>
                            <div className="progress progress-sm m-0">
                            <div className="progress-bar bg-info" role="progressbar" aria-valuenow={74} aria-valuemin={0} aria-valuemax={100} style={{width: '74%'}}>
                                <span className="visually-hidden">74% Complete</span>
                            </div>
                            </div>
                        </div>
                        </div>
                    </div> {/* end card*/}
                    </div> {/* end col */}
                </div>
            </div>
        </>
    )
}

export default Dashboard;