program find z
    implicit none
    integer :: n
    real(8) :: z
    n = 0
    z = 2.0d0

    do
        n = n + 1
        z = z / 10.0d0
        print*, 'Iteration ', n, ': z = ', z

        if (2.0d0 * z == z) exit
    end do

    print*, 'Number of iterations: ', n
end program find z
