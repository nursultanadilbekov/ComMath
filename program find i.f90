program find i
    implicit none
    integer :: n
    real(8) :: i
    n = 0
    i = 2.0d0

    do
        n = n + 1
        i = i * 10.0d0
        print*, 'Iteration ', n, ': i = ', i

        if (2.0d0 * i == i .AND. 2.0d0 + i == i) exit
    end do

    print*, 'Number of iterations: ', n
end program find i
