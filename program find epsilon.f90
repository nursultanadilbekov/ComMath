program find epsilon
    implicit none
    integer :: n
    real(8) :: e
    n = 0
    e = 1.0d0

    do
        n = n + 1
        e = e / 10.0d0
        print*, 'Iteration ', n, ': e = ', e

        if (1.0d0 + e == 1.0d0) exit
    end do

    print*, 'Number of iterations: ', n
end program epsilon_check
